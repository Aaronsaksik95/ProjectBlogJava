package ynov.aaron.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ynov.dao.DAOFactory;
import ynov.dao.article.DAOArticle;
import ynov.model.Article;

public class Auteur extends HttpServlet {


	DAOFactory factory = new DAOFactory();
	DAOArticle daoArticle = factory.getDaoArticle();
	
	
	public Auteur() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/Auteur.jsp").forward(req, resp);
	}
	
	
	

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String auteur = req.getParameter("auteur");
		
		
		req.setAttribute("LUsers",daoArticle.getUserArticles(auteur));
		
	
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/Auteur.jsp").forward(req, resp);
		
	}
}
