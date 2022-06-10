<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,javax.sql.*"%>
<%
Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs=null;

try{
	Class.forName("oracle.jdbc.OracleDriver");
	con=DriverManager.getConnection
			("jdbc:oracle:thin@//localhost:1521/XE","system","1234");
	
	pstmt=con.prepareStatement("select max(custno)from member_tbl_02");
	
	rs=pstmt.executeQuery();
	
	int custno=100001;
	if(rs.next()){
		custno=rs.getInt(1)+1;
	}
	%>	
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
	margin-left: 20px;
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
table,
        th,
        td {
            border: 1px solid gray;
        }
table{
	width:700px;
	margin: 0 auto;
}
</style>
</head>
<script type="text/javascript">
function checkForm(f){
	if(f.custname.value.trim()==""){
		alert("회원성명이 입력되지 않았습니다.");
		f.custname.focus();
		return false;
	}
	}
}
</script>
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
		<h3>쇼핑몰 회원 등록</h3>
		<form action="join.do" method="post" name="f">
		 <table>
            <tr>
                <th>회원번호(자동발생)</th>
                <td><input type="text" id="num" name="num"></td>
            </tr>
            <tr>
                <th>회원성명</th>
                <td><input type="text" id="name" name="name"></td>
            </tr>
            <tr>
                <th>회원전화</th>
                <td><input type="text" id="phone" name="phone" size="30"></td>
            </tr>
            <tr>
                <th>회원주소</th>
                <td><input type="text" id="adress" name="adress" size="50"></td>
            </tr>
            <tr>
                <th>가입일자</th>
                <td><input type="text" id="date" name="date"></td>
            </tr>
            <tr>
                <th>고객등급[A:VIP, B:일반, C:직원]</th>
                <td><input type="text" id="grade" name="grade"></td>
            </tr>
            <tr>
                <th>도시코드</th>
                <td><input type="text" id="cityNum" name="cityNum"><br></td>
            </tr>
            <tr>
                <th colspan="2">
                    <input type="submit" value="등록" >
                    <a href="list.jsp"><input type="button" value="조회" ></a>
                </th>
            </tr>
        </table>
        </form>
	</section>
	<footer> HRDKOREA Copyrightⓒ2016 All right reserved. Human
		Resources Development Service of Korea. </footer>
</body>
</html>