package ynov.aaron.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ynov.dao.article.DAOArticle;
import ynov.dao.article.DAOArticleImpl;
import ynov.dao.DAOFactory;
import ynov.model.Article;

public class Index extends HttpServlet {
	
	DAOFactory factory = new DAOFactory();
	DAOArticle daoArticle = factory.getDaoArticle();
	
	
	public Index() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("LArticles",daoArticle.getAllArticles());
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward(req, resp);
	}
	
	
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward(req, resp);
		
	}

}
