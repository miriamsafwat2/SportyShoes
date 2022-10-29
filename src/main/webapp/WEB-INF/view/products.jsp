<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Users</title>
</head>
<body>
<h1> Products in our system:</h1>
 <ul>
 <c:forEach items="${products}" var="p">
 <li> ${p.name}
</c:forEach>
</ul>
</body>
</html>