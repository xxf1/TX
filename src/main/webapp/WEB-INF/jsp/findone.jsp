<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>根据ID查找对象</title>
</head>
<body>
<form action="findOne">
请输入查找的id:<input name="id" type="text">
<input type="submit">
</form>
账号:${user.username}<br>
密码:${user.password}  
</body>
</html>