<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax</title>
</head>
<body>
	<p onclick="getData()">데이터를 가져와라</p>
	
</body>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>
	/* $.ajax({
		url: "요청할 경로",
		type: "get 또는 post", 생략 시 get
		contentType: "전달할 데이터의 타입",
		data: "전달할 데이터", 생략시 text
		dataType: "결과의 타입",
		success: function(){}
		error: function(){}
	}); */
	function getData(){
	$.ajax({
		url: "data.jsp",
		success: function(result){console.log(result.trim());},
		error: function(a, b, c){console.log(a, b, c);}
	});
	}
</script>
</html>