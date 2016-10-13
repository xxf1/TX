<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>删除数据成功</title>
</head>
<body>
<form action="delete">
请输入删除对象的id:<input name="id" type="text">
<input type="submit">
</form>
删除数据：${success}
</body>
</html>