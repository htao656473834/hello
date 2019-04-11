<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>执行成功</h1>
<h5>${role.id } ${role.name }${role.age }</h5>
<table border="1">
	<tr>
			<th>用户ID</th>
			<th>用户名字</th>
			<th>用户年龄</th>
		</tr>
		<tr>
			<th>${role.id}</th>
			<th>${role.name}</th>
			<th>${role.age }</th>
		</tr>

	</table>
</body>
</html>