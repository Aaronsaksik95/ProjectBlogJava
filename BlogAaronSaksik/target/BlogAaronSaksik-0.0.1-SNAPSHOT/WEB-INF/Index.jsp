<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	
	<form action="" method="post">
		
		<input type="text" name= "user" placeholder="Auteur">
		<input type="text" name= "title" placeholder="Titre">
		<input type="text" name= "description" placeholder="Description">
		<input type="text" name= "text" placeholder="Texte">
		<input type="submit" value= "envoyer">
	</form>
	
	<p>${user}</p>
	<p>${title}</p>
	<p>${description}</p>
	<p>${text}</p>
<body>
</body>
</html>


