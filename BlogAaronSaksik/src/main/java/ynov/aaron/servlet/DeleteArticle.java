package ynov.aaron.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ynov.dao.DAOFactory;
import ynov.dao.article.DAOArticle;

public class DeleteArticle extends HttpServlet {
	
	DAOFactory factory = new DAOFactory();
	DAOArticle daoArticle = factory.getDaoArticle(); 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		daoArticle.deleteArticle(id);
		
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/DeleteArticle.jsp").forward(req, resp);
	
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/DeleteArticle.jsp").forward(req, resp);
		
	}

}
