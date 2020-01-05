package ynov.aaron.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ynov.dao.DAOFactory;
import ynov.dao.article.DAOArticle;
import ynov.model.Article;


public class UpdateArticle extends HttpServlet {

	DAOFactory factory = new DAOFactory();
	DAOArticle daoArticle = factory.getDaoArticle(); 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		
		
		req.setAttribute("user", daoArticle.getArticle(id).getUser());
		req.setAttribute("title", daoArticle.getArticle(id).getTitle());
		req.setAttribute("description", daoArticle.getArticle(id).getDescription());
		req.setAttribute("text", daoArticle.getArticle(id).getText());
		
		
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/UpdateArticle.jsp").forward(req, resp);
	
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		String user = req.getParameter("user");
		String title = req.getParameter("title");
		String description = req.getParameter("description");
		String text = req.getParameter("text");
		
		
		Article article = new Article(id, user, title, description, text);
		
		daoArticle.updateArticle(article);
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/UpdateArticle.jsp").forward(req, resp);
		
	}
}


