<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>User Search</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <form action="user_save" method="post" id="addUserForm">
	  <table>
	  	<tr>
	  		<td>name</td>
	  		<td>
	  			<input type="text" name="user.name" value="${user.name }" />
	  			<input type="hidden" name="user.id" value="${user.id }"/>
	  		</td>
	  	</tr>
	  	<tr>
	  		<td>password</td>
	  		<td><input type="text" name="user.password" value="${user.password }" /></td>
	  	</tr>
	  	<tr>
	  		<td>age</td>
	  		<td><input type="text" name="user.age" value="${user.age }" /></td>
	  	</tr>
	  	<tr>
	  		<td colspan="2" align="center">
	  			<input type="submit" value="Save" />
	  		</td>
	  	</tr>
	  </table>
  </form>
  </body>
</html>
