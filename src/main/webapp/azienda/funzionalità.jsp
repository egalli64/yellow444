<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrazione</title>
<link rel="stylesheet" type="text/css" href="/yellow/css/basictwo.css">
</head>
<body>
	<div>
		<h1>Registrazione effettuata con successo!</h1>
		<p>
			Benvenuto <span> ${nome} </span>, il tuo contributo è fondamentale! <br>
			Scegli fra le diverse opzioni che la nostra piattaforma mette a
			disposizione.
		</p>
	</div>

	<div>
		<form class='blu' action="yellow/azienda/funzionalità_inserire"
			method='get'>
			<p>1) Inserisci il tipo di materiale che la tua azienda vuole
				riciclare e la quantità disponibile:</p>
			<br> <label class='ciao' for="nome">Azienda:</label> <input
				type="text" name="nome"><br> <br> <label
				class='ciao' for="materiale">Materiale:</label> <select
				name="materiale">
				<option value='none'>-</option>
				<option value='cartone'>cartone</option>
				<option value='ceramica'>ceramica</option>
				<option value='legno'>legno</option>
				<option value='truciolato'>truciolato</option>
				<option value='vetro'>vetro</option>
			</select> <br> <br> <label class='ciao' for="quantità">Quantità:</label>
			<input type="text" name="quantità"><br>
			<br>

			<button>Ok</button>
		</form>
		<br>

		<form class='blu' action="yellow/azienda/funzionalità_aggiornare"
			method='get'>
			<p>2) Aggiorna la quantità di materiale di scarto che la tua
				azienda ha a disposizione:</p>
			<br> <label class='ciao' for="nome">Azienda:</label> <input
				type="text" name="nome"><br> <br> <label
				class='ciao' for="quantità">Nuova quantità:</label> <input
				type="text" name="quantità"><br>
			<br>

			<button>Ok</button>
		</form>
		<br>

		<form class='blu' action="yellow/azienda/funzionalità_chiedere"
			method='get'>
			<p>3) Di che materiale hai bisogno? Trova l'azienda che può
				fornirtelo:</p>
			<br> <label class='ciao' for="materiale">Materiale:</label> <select
				name="materiale">
				<option value='none'>-</option>
				<option value='cartone'>cartone</option>
				<option value='ceramica'>ceramica</option>
				<option value='legno'>legno</option>
				<option value='truciolato'>truciolato</option>
				<option value='vetro'>vetro</option>
			</select> <br> <br>

			<button>Ok</button>
			<br> <br>
		</form>
	</div>


</body>
</html>