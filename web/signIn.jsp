<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>

<html>

<head>
<meta charset="utf-8">
  <title>登录</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">

<link rel="stylesheet"  href="css/sig.css">

</head>


<body>
<div class="container">
<h2>登录</h2>
	<form  action="login" method="post" >
	  <div class="form-group">
	    <label for=""><span class="glyphicon glyphicon-user" aria-hidden="true"></span></label>
	    <input type="text" class="form-control" id="userName" placeholder="请输入用户名" name = "userName">
	  </div>
	  <div class="form-group">
	    <label for=""><span class="glyphicon glyphicon-lock" aria-hidden="true"></span></label>
	    <input type="password" class="form-control" id="userPassword" placeholder="请输入密码" name = "userPassword">
	  </div>
		<div class="role">
			管理员：<input type="radio" name="role" value="1">&nbsp&nbsp&nbsp&nbsp
			用户：<input type="radio" name="role" value="2">
		</div>
	  <div class="btn1">
	  <button type="submit" class="btn btn-default">登录</button>
	  </div>
	</form>
	<div class="re">
	没有账号？点击
	<a href = "reg.jsp">这里</a>
	
	</div>
</div>

</body>
</html>