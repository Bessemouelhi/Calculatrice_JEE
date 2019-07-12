<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>

<h1><c:out value="Une Calculatrice !" /></h1>

<p><c:if test="${ 15 < 10 }" var="variable">${ variable }</c:if></p>
<c:choose>
    <c:when test="${ variable }">C'est Vrai !</c:when>
    <c:otherwise>C'est Faux !</c:otherwise>
</c:choose>

<h2>${!empty submit ? submit : ""}</h2>

<br>

<p>${!empty result ? result : ""}</p>
<form action="calculatrice" method="post">
  <input type="number" name="x">
  <select name="ope">
    <option value="additionner">+</option>
    <option value="soustraire">-</option>
    <option value="multiplier">*</option>
    <option value="diviser">/</option>
</select>
  <input type="number" name="y">
  <input type="submit" value="default">
</form>

<br><hr><br>

</body>
</html>