<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<h1>Your first and last name is : </h1>
<%
String firstName = (String) session.getAttribute("firstname");

String lastName = (String) session.getAttribute("lastname");


%>
<p> <%=firstName %></p>
<p><%=lastName %>
</body>
</html>