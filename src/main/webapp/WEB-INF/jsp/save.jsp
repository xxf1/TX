<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>保存对象</title>
</head>
<body>
<form action="save">
请输入添加的账号：<input name="username" type="text"><br>
请输入添加的密码：<input name="password" type="text">
<input type="submit" value="提交">
</form>
保存数据:${success}
</body>
</html>