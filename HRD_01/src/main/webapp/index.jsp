<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0px;
}

ul, ol li {
	list-style: none;
	margin: 0;
	padding: 0;
}

header {
	background-color: blue;
	width: 1000px;
	height: 100px;
	margin: 0 auto;
}

header>h1 {
	text-align: center;
	line-height: 100px;
	color: white;
}

nav {
	background-color: skyblue;
	width: 1000px;
	height: 40px;
	margin: 0 auto;
}

nav>ul>li>a {
	float: left;
	color: window;
	text-decoration: none;
	margin: 10px 30px;
}

section {
	background-color: #ddd;
	width: 1000px;
	height: 600px;
	margin: 0 auto;
}

section>h3 {
	text-align: center;
	line-height: 50px;
}

section>h4 {
	margin-left:20px;
}

section>ol>li {
	list-style-type: decimal;
}

footer {
	background-color: blue;
	width: 1000px;
	height: 50px;
	margin: 0 auto;
	text-align: center;
	line-height: 50px;
	color: white;
	font-size: 12px;
}
</style>
</head>
<body>
	<header>
		<h1>쇼핑몰 회원관리 ver1.0</h1>
	</header>
	<nav>
		<ul>
			<li><a href="joinForm.jsp">회원등록</a></li>
			<li><a href="list.jsp">회원목록조회/수정</a></li>
			<li><a href="sales.jsp">회원매출조회</a></li>
			<li><a href="index.jsp">홈으로</a></li>
		</ul>
	</nav>
	<section>
		<br>
		<h3>쇼핑몰 회원관리 프로그램</h3>
		<h4>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.</h4>
		<h4>프로그램 작성 순서</h4>
		<ol>
			<li>회원정보 테이블을 생성한다.</li>
			<li>매출정보 테이블을 생성한다.</li>
			<li>회원정보, 매출정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.</li>
			<li>회원정보 입력 화면프로그램을 작성한다.</li>
			<li>회원정보 조회 프로그램을 작성한다.</li>
			<li>회원매출정보 조회 프로그램을 작성한다.</li>
		</ol>
	</section>
	<footer> HRDKOREA Copyrightⓒ2016 All right reserved. Human
		Resources Development Service of Korea. </footer>
</body>
</html>