<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
		 	<form id="contactForm" action="servletdemo" method="post">
  					<table border=”0”>
					<tr>
					<td> First Name : </td> <td><input type="text" name=”firstname”/></td>
					</tr>
					<tr>
					<td>Last Name : </td> <td><input type="text" name=”lastname”/></td>
					</tr>
					<tr>
					<td colspan=”2”> <input type="submit" value="submit"/></td>
					</tr>
					</table>
  				 </form>
</body>
</html>