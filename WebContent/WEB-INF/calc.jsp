<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>
	<%
	if (request.getMethod().equals("POST")) {
		int num1 = Integer.parseInt((String) request.getAttribute("num1"));
		int num2 = Integer.parseInt((String) request.getAttribute("num2"));
		out.println("Le resultat de l'équation "+num1+" + "+num2+" est: "+(num1+num2));
	}
	%>
	<form name="myForm" action="" method="post" >
		<input name="num1" type="number">
		<label>+</label>
		<input name="num2" type="number">
		<input type="submit" value="envoyer">
	</form>
</body>
</html>