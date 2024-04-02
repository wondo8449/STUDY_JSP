<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p onclick="getData()">주스를 가져와라</p>
</body>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
	function getData(){
	$.ajax({
		url: "juice.jsp",
		success: function(result){console.log(result.trim());},
		error: function(a, b, c){console.log(a, b, c);}
	});
	}
</script>
</html>