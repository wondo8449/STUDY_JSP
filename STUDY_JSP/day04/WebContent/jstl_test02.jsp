<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="id" value="member"/>
	<c:choose>
		<c:when test="${id == 'member'}">현재 로그인된 계정은 <c:out value="${id}"/></c:when>
		<c:otherwise>현재 로그인된 계정은 일반 계정입니다</c:otherwise>
	</c:choose>
	
	<%-- <c:if test="${id == 'admin'}">
		현재 로그인된 계정은 <c:out value="${id}"/>
	</c:if>
	<c:if test="${id == 'member'}">
		현재 로그인된 계정은 일반 계정입니다
	</c:if> --%>
</body>
</html>