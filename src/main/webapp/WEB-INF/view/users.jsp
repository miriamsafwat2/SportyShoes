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
<h1> Users registered on our system:</h1>
 <!--  <p>Hello, ${name}! </p> -->
 <ul>
 <c:forEach items="${users}" var="user">
 <li> ${user.name}
</c:forEach>
</ul>
</body>
</html>