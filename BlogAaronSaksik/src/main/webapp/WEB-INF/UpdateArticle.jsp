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
	<main class="p-5">
	<div class="pt-5">
	  <form action="" method="post" class="pr-5 pl-5">
		<div class="form-group pt-5">
		    <label for="exampleFormControlInput1">Votre nom</label>
		    <input type="text" id="user" value="${user}" name="user" class="form-control" id="exampleFormControlInput1" placeholder="Aaron Saksik">
	  	</div>
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Le titre de l'article</label>
	    <input type="text" id="title" value="${title}" name="title" class="form-control" id="exampleFormControlInput1">
	  </div>
	  <div class="form-group">
	    <label for="exampleFormControlTextarea1">Description de l'article</label>
	    <textarea class="form-control" name="description" id="exampleFormControlTextarea1" rows="2">${description}</textarea>
	  </div>
	  <div class="form-group">
	    <label for="exampleFormControlTextarea1">Article</label>
	    <textarea class="form-control" name="text" id="exampleFormControlTextarea1" rows="4">${text}</textarea>
	  </div>
	  <button type="submit" class="btn btn-primary">Envoyer</button>
	    
	  </form>
	</div>
	</main>
	
  
<%@ include file="Footer.jsp" %>
</body>
</html>