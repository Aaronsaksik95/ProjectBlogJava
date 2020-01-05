package ynov.aaron.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ynov.dao.DAOFactory;
import ynov.dao.article.DAOArticle;

public class AllArticle extends HttpServlet {
	
	DAOFactory factory = new DAOFactory();
	DAOArticle daoArticle = factory.getDaoArticle();
	
	
	public AllArticle() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("LArticles",daoArticle.getAllArticles());
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/AllArticle.jsp").forward(req, resp);
	}
	
	
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/AllArticle.jsp").forward(req, resp);
		
	}
}
