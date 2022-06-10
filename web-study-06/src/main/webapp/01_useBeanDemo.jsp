<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 객체생성 ==> MemberBean member = new MemberBean() 자바에서 했던것 -->
<jsp:useBean id="member" class="com.saeyan.javabeans.MemberBean"></jsp:useBean>

이름 : <%= member.getName() %> <br>
아이디 : <%=member.getUserid() %> <hr>

<h1> 정보 변경 후</h1>
<%
	member.setName("전수빈");
	member.setUserid("pinksubin");
%>
이름 : <%= member.getName() %> <br>
아이디 : <%=member.getUserid() %>

</body>
</html>