<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
请输入更改用的的id：<input name="id" type="text"><br>
请输入更改用户的新账号：<input name="username" type="text"><br>
请输入更改用户的新密码：<input name="password" type="text"><br>
<input type="submit" value="提交">
</form>
更改数据:${fail}
</body>
</html>