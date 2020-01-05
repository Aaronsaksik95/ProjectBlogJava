<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Auteurs</title>
</head>
<body>
	<header class="">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="Index">Le Meilleur Blog</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="AllArticle">Article
            </a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="AddArticle">Ajouter un article</a>
          </li>
          <form class="form-inline" method="post">
		<input class="form-control mr-sm-2" type="search" name="auteur" placeholder="Auteurs" aria-label="Search">
		<button class="btn btn-outline-info my-2 my-sm-0" type="submit">Rechercher</button>
	</form>
        </ul>
      </div>
    </div>
  </nav>
	</header>
	
	<main>
		<div class="pt-5 text-center"><h6 class="pt-5 pl-5">Cherchez des articles avec le nom d'un auteur !</h6></div>
		
		<c:forEach items="${LUsers}" var="LUser" begin="0" end="0">
			<div class="pl-5">
				<h1 class="pl-5 text-primary">${LUser.getUser()}</h1>
			</div>
		</c:forEach>
		
		<c:forEach items="${LUsers}" var="LUser">

        <div class="card pt-5 "> 
          <img class="rounded mx-auto d-block w-50 p-3 pt-5" class="" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title">${LUser.getTitle()}</h2>
            <h4 class="card-title">${LUser.getDescription()}</h4>
            <p class="card-text">${LUser.getText()}</p>
            <a href="OneArticle?id=${LUser.getId()}" class="btn btn-primary">Lire l'article &rarr;</a>
          </div>
          <div class="card-footer text-muted">
            ${LUser.getDate()} <br>
            <br>
            <a class="float-right" href="UpdateArticle?id=${LUser.getId()}">Modifier</a>
            <br>
            <a class="float-right" href="DeleteArticle?id=${LUser.getId()}">Supprimer</a>
          </div>
        </div>
		
		</c:forEach>
	</main>
</body>
</html>