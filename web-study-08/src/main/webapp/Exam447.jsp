<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>정보 입력 폼</h1>
	<form action="Exam447_2.jsp" method="post">
		<table>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="text" name="price" size="20"></td>
			</tr>
			<tr>
				<td>설명</td>
				<td><textarea cols="100" rows="15" name="description"></textarea></td>
			</tr>
		</table>
		<input type="submit" value="전송" style="margin-left: 350px;">
		&nbsp; <input type="reset" value="취소">
	</form>
</body>
</html>