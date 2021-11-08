<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<%-- 	${loginNick }님 환영합니다
	<br> ${loginId }님 환영합니다
	<br>
	<a href="logout">로그아웃</a>
 --%>
	<c:choose>
		<c:when test="${loginId ==null }">
			<script type="text/javascript">
				alert("로그인하셔야합니다")
				location.href = "login"
			</script>

		</c:when>
		<c:otherwise>
			${loginNick }님 환영합니다<br> 
			${loginId }님 환영합니다<br>
			<a href="logout">로그아웃</a>
		</c:otherwise>
	</c:choose>

</body>
</html>