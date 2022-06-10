<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${param.logintype == 'user'}">
${param.id}님 사용자로 로그인 하셨습니다.
</c:when>
<c:when test="${param.logintype == 'manager'}">
${param.id}님 관리자로 로그인 하셨습니다.
</c:when>
</c:choose>
</body>
</html>