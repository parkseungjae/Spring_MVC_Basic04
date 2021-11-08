<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 만료</title>
</head>
<body>
	<br> id : ${id }, ${sessionScope.id }
	<br> name : ${name }, ${sessionScope.name }
	<br>
	<hr>
	<a href="result_session">result_session</a>
	<a href="make_session">make_session</a>

</body>
</html>