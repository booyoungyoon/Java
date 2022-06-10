<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int num1=Integer.parseInt(request.getParameter("num"));
%>
<h1>1부터 <%=num1%>까지 자연수 합 구하기</h1>
<%
	int sum=0;
	for(int i=1;i<num1;i++){
		sum+=i;
	%>
	<%=i%> +
	<%}%>
<%=num1%> = <%=sum+num1 %>

</body>
</html>