<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
java.util.List<String> seasonList=new java.util.ArrayList<String>();
seasonList.add("봄");
seasonList.add("여름");
seasonList.add("가을");
seasonList.add("겨울");
request.setAttribute("lists", seasonList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<select name="season">
		<c:forEach var="list" items="${lists}">
			<option value="${list}">${list}</option>
		</c:forEach>
	</select>
</body>
</html>