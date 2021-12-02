<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuovo utente</title>
<link rel="stylesheet" type="text/css" href="/yellow/css/basic3.css">
</head>
<body>
<div>
<h1>Benvenuto!</h1>
<p> Compila il form sottostante per procedere con la registrazione. </p>
<form id= "newform" action="/yellow/utente/nuovo" method="post">
  <label class= "tform" for="nome">Azienda:</label>
  <input type="text"  name="nome"><br><br>
     <label class= "tform" for= "latitudine"> Latitudine:</label> 
  <input type="text" name="latitudine"> <br><br>
  <label class= "tform" for= "longitudine"> Longitudine:</label> 
  <input type="text" name="longitudine"> <br><br>
  <label class= "tform" for= "password"> Password:</label> 
  <input type="password" name="password"> <br><br>
   <label class= "tform" for= "password"> Conferma password:</label> 
  <input type="password" name="password"> <br><br>
  <input id= "bottone" type="submit" value="Clicca qui!"><br><br>
</form>
</div>

</body>
</html>