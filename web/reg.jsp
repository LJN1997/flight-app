<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>

<html>
<head>
<meta charset="utf-8">
  <title>注册</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet"  href="css/reg.css">

</head>


<body>
<div class="container">
<h2>注册</h2>
	<form action="" method="post" id="formcon">

	  <div class="form-group">
	    <label for="userName">用户名</label>
	    <input type="text" class="form-control" id="userName" placeholder="请输入用户名" name="userName">
	  </div>

	  <div class="form-group">
	    <label for="userPassword">密码</label>
	    <input type="password" class="form-control" id="userPassword" placeholder="请输入密码" name = "userPassword">
	  </div>
	
	  <div class="btn1">
	  <button type="submit" class="btn btn-default">注册</button>
	  </div>
	</form>
	<div class="re">
		已有账号，请点击
		<a href = "signIn.jsp">这里</a>

	</div>
	</div>


</body>
</html>