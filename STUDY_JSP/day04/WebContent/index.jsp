<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 페이지</title>
</head>
<body>
	<jsp:include page="header.jsp"/>

	<form action="Hello" method="post">
		<input type="text" name="infoName" placeholder="이름">
		<input type="text" name="infoAge" placeholder="나이"></br>
		<input type="radio" name="infoGender" value="남자">남자
		<input type="radio" name="infoGender" value="여자">여자
		<input type="radio" name="infoGender" value="선택안함">선택안함
		<button>전송</button>
	</form>
	
	${param.infoName}
	${param.infoAge}
	${param.infoGender}

	<jsp:include page="footer.jsp"/>
</body>
</html>