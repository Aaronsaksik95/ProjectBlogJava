package ynov.dao.article;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ynov.model.Article;

public class DAOArticleImpl implements DAOArticle {
	
	private Connection connection;
	
	public DAOArticleImpl(Connection connection) {
		this.connection = connection;
	}

	public Article getArticle(int id) {
		
		Article article = new Article(null, null, null, null, null);
		
		try {
			
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM Article WHERE id=?;");
			ps.setInt(1, id);
			
			ResultSet result = ps.executeQuery();
			
			
			while(result.next()){
				
				article.setUser(result.getString("user"));
				article.setTitle(result.getString("title"));
				article.setDescription(result.getString("description"));
				article.setText(result.getString("text"));
				article.setDate(result.getDate("date"));
				
			}
			
		}
		catch(SQLException e) {
    		e.printStackTrace();
    	}
		return article;
	}

	public List<Article> getAllArticles() {
		
		
		
		List<Article> LArticles = new ArrayList<Article>();
		
		
		try {
			
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM Article;");
			
			ResultSet result = ps.executeQuery();
			
			while (result.next()) {
				
				Article article = new Article(null, null, null, null, null);
				
				article.setId(result.getInt("id"));
				article.setUser(result.getString("user"));
				article.setTitle(result.getString("title"));
				article.setDescription(result.getString("description"));
				article.setText(result.getString("text"));
				article.setDate(result.getDate("date"));
				LArticles.add(article);
				
			}
			Collections.reverse(LArticles);
		}
		catch(SQLException e) {
    		e.printStackTrace();
    	}
		
		return LArticles;
		
		
	}
	
	
	public List<Article> getUserArticles(String user) {
		
		
		
		List<Article> LUsers = new ArrayList<Article>();
		
		
		try {
			
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM Article WHERE user=?;");
			ps.setString(1, user);
			
			ResultSet result = ps.executeQuery();
			
			while (result.next()) {
				
				Article article = new Article(null, user, null, null, null);
				
				article.setId(result.getInt("id"));
				article.setUser(result.getString("user"));
				article.setTitle(result.getString("title"));
				article.setDescription(result.getString("description"));
				article.setText(result.getString("text"));
				article.setDate(result.getDate("date"));
				LUsers.add(article);		
				System.out.println(LUsers);
			}
			Collections.reverse(LUsers);
			
		}
		catch(SQLException e) {
    		e.printStackTrace();
    	}
		return LUsers;
		
		
		
	}
	
	public void addArticle(Article article) {
		try {
			
		PreparedStatement ps = connection.prepareStatement("INSERT INTO Article (user, title, description, text, date) VALUES (?,?,?,?,?);");
		
			
		
			ps.setString(1, article.getUser());
    		ps.setString(2, article.getTitle());
    		ps.setString(3, article.getDescription());
    		ps.setString(4, article.getText());
    		ps.setTimestamp(5, new java.sql.Timestamp(System.currentTimeMillis()));
    		 
    		
    		int statut = ps.executeUpdate();
    		
    		System.out.println(statut);
		}
		
		catch(SQLException e) {
    		e.printStackTrace();
    	}

	}

	public void updateArticle(Article article) {
		try {
			
			PreparedStatement ps = connection.prepareStatement("UPDATE Article SET user = ?, title = ?, description = ?, text = ? WHERE id = ?;");
			
			ps.setString(1, article.getUser());
    		ps.setString(2, article.getTitle());
    		ps.setString(3, article.getDescription());
    		ps.setString(4, article.getText());
    		ps.setInt(5, article.getId());
    		int statut = ps.executeUpdate();
    		
    		
		}
		
		catch(SQLException e) {
    		e.printStackTrace();
    	}
		
	}

	public Article deleteArticle(int id) {
		
		Article article = new Article(null, null, null, null, null);
		try {
			
			PreparedStatement ps = connection.prepareStatement("DELETE FROM Article WHERE id = ?;");
			
    		ps.setInt(1, id);
    		int statut = ps.executeUpdate();
    		
		}
		
		catch(SQLException e) {
    		e.printStackTrace();
    	}
		return article;
	}

}
