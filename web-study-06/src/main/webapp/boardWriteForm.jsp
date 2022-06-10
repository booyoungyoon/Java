<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.front {background-color: yellow; text-align: center;}
#butt1 {margin-left: 450px;}
</style>
</head>
<body>
<h2 style="margin-left: 420px;">게시판 글쓰기</h2>
	<form method="post" action="boardWrite.jsp">
		<table border="1">
			<tr>
				<td class="front">작성자</td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td class="front">비밀번호</td>
				<td><input type="text" name="pass" size="20" > (게시물 수정 삭제시 필요합니다.)</td>
				
			</tr>
			<tr>
				<td class="front">이메일</td>
				<td><input type="text" name="email" size="70"></td>
			</tr>
			<tr>
				<td class="front">글 제목</td>
				<td><input type="text" name="title" size="120"></td>
			</tr>
			<tr>
				<td class="front">글 내용</td>
				<td><textarea name="content" rows="30" cols="130"></textarea></td>
		</table> <br>
				<input type="submit" value="등록" id="butt1"> &nbsp;
				<input type="reset" value="다시 작성">
	</form>
</body>
</html>