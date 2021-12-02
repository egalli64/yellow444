<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuovo utente</title>
</head>
<body>
<form id= "form" action="/yellow/utente/nuovo" method="post">
  <label class= "testoform" for="nome">Azienda:</label>
  <input type="text"  name="nome"><br><br>
    <label class= "testoform" for="materiale">Materiale di scarto:</label>
     <input type="text" id="nome" name="materiale"><br><br>
     <label class= "testoform" for= "latitudine"> Latitudine:</label> 
  <input type="password" name="latitudine"> <br>
  <label class= "testoform" for= "longitudine"> Longitudine:</label> 
  <input type="password" name="longitudine"> <br>
  <label class= "testoform" for= "password"> Password:</label> 
  <input type="password" name="password"> <br>
   <label class= "testoform" for= "password"> Conferma password:</label> 
  <input type="password" name="password"> <br>
  <input id= "bottone" type="submit" value="Clicca qui!">
</form>

</body>
</html>