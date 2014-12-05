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
  <a href="<%=basePath %>user/user_search">查询</a><br/>
  <a href="user/user_toAdd">增加</a>
    <table>
    	<tr>
    		<td>id</td>
    		<td>name</td>
    		<td>password</td>
    		<td>age</td>
    		<td>operate</td>
    	</tr>
    <c:forEach items="${users}" var="user">
    	<tr>
    		<td>${user.id}</td>
    		<td>${user.name}</td>
    		<td>${user.password}</td>
    		<td>${user.age}</td>
    		<td><a href="user/user_toEdit?user.id=${user.id}">修改</a></td>
    	</tr>
    </c:forEach>
    </table>
  </body>
</html>
