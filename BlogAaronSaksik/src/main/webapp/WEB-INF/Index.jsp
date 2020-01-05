<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	
	<main>
		<c:forEach items="${LArticles}" begin="0" end="1" var="LArticle">
			
			<!-- Blog Post -->
        <div class="card pt-5 "> 
          <img class="rounded mx-auto d-block w-50 p-3 pt-5" class="" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title">${LArticle.getTitle()}</h2>
            <h4 class="card-title">${LArticle.getDescription()}</h4>
            <p class="card-text">${LArticle.getText()}</p>
            <a href="OneArticle?id=${LArticle.getId()}" class="btn btn-primary">Lire l'article &rarr;</a>
          </div>
          <div class="card-footer text-muted">
            ${LArticle.getDate()} <br>
           	<h5>${LArticle.getUser()}</h5>
            <br>
            <a class="float-right" href="UpdateArticle?id=${LArticle.getId()}">Modifier</a>
            <br>
            <a class="float-right" href="DeleteArticle?id=${LArticle.getId()}">Supprimer</a>
          </div>
        </div>
		
		</c:forEach>
		<div class="pt-5 text-center"><div class="pt-5 pb-5 text-center"><a href="AddArticle" class=" btn btn-primary">Ajouter un article</a></div></div>
		
	</main>
<%@ include file="Footer.jsp" %>
</body>
</html>