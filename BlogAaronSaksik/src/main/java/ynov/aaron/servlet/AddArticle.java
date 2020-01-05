package ynov.aaron.servlet;

import java.io.IOException;

import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ynov.dao.DAOFactory;
import ynov.dao.article.DAOArticle;
import ynov.model.Article;

public class AddArticle extends HttpServlet {
	
	DAOFactory factory = new DAOFactory();
	DAOArticle daoArticle = factory.getDaoArticle(); 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/AddArticle.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String user = req.getParameter("user");
		String title = req.getParameter("title");
		String description = req.getParameter("description");
		String text = req.getParameter("text");
		
		
		Article article = new Article(null, user, title, description, text);
		
		daoArticle.addArticle(article);
		
	
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/AddArticle.jsp").forward(req, resp);
		
	}
}
