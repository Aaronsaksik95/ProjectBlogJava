package ynov.aaron.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ynov.dao.DAOFactory;
import ynov.dao.article.DAOArticle;

public class OneArticle extends HttpServlet {
	
	DAOFactory factory = new DAOFactory();
	DAOArticle daoArticle = factory.getDaoArticle(); 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer var = Integer.parseInt(req.getParameter("id"));
		
		
		req.setAttribute("id", var);
		req.setAttribute("user", daoArticle.getArticle(var).getUser());
		req.setAttribute("title", daoArticle.getArticle(var).getTitle());
		req.setAttribute("description", daoArticle.getArticle(var).getDescription());
		req.setAttribute("text", daoArticle.getArticle(var).getText());
		req.setAttribute("date", daoArticle.getArticle(var).getDate());
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/OneArticle.jsp").forward(req, resp);
	
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/OneArticle.jsp").forward(req, resp);
		
	}
}
