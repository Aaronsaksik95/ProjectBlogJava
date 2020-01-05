package ynov.dao.article;

import java.util.List;

import ynov.model.Article;

public interface DAOArticle {
	
	public Article getArticle(int id);
	public List<Article> getAllArticles();
	public List<Article> getUserArticles(String user);
	public void addArticle(Article article);
	public void updateArticle(Article article);
	public Article deleteArticle(int id);

}
