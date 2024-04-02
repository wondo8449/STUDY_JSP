<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL TEST</title>
</head>
<body>
	<h2>JSTL TEST</h2>
	<c:set var="name" value="홍길동"/>
	<h3><c:out value="${name}"/></h3>
</body>
</html>