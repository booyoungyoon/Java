<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="com.saeyan.javabeans.ItemBean"></jsp:useBean>
<jsp:setProperty name="member" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>입력 완료된 회원 정보</h1>
<table>
<tr>
<td>상품명</td>
<td><jsp:getProperty property="name" name="member"/></td>
</tr>
<tr>
<td>가격</td>
<td><jsp:getProperty property="price" name="member"/></td>
</tr>
<tr>
<td>설명</td>
<td><jsp:getProperty property="description" name="member"/></td>
</tr>
</table>
</body>
</html>