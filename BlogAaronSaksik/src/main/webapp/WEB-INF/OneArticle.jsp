<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="card pt-5 "> 
          <img class="rounded mx-auto d-block w-50 p-3 pt-5" class="" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title">${title}</h2>
            <h4 class="card-title">${description}</h4>
            <p class="card-text">${text}</p>
          </div>
          <div class="card-footer text-muted">
            <h5>${user}</h5>
            <a class="float-right" href="UpdateArticle?id=${id}">Modifier</a>
            <br>
            <a class="float-right" href="DeleteArticle?id=${id}">Supprimer</a>
            <h6>${date}</h6>
          </div>
        </div>
	<%@ include file="Footer.jsp" %>
</body>
</html>