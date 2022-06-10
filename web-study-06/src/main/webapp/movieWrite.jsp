<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="com.saeyan.javabeans.MovieBean"></jsp:useBean>
<jsp:setProperty name="member" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력 완료된 정보</h1>
	<table>
		<tr>
			<td>제목</td>
			<td><jsp:getProperty property="title" name="member" /></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><jsp:getProperty property="price" name="member"/>원</td>
		</tr>
		<tr>
			<td>감독</td>
			<td><jsp:getProperty property="director" name="member" /></td>
		</tr>
		<tr>
			<td>출연배우</td>
			<td><jsp:getProperty property="actor" name="member" /></td>
		</tr>
		<tr>
			<td>시놉시스</td>
			<td><jsp:getProperty property="synopsis" name="member" /></td>
		</tr>
		<tr>
			<td>장르</td>
			<td><jsp:getProperty property="genre" name="member" /></td>
		</tr>
	</table>
</body>
</html>