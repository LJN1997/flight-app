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
	<form  action="" method="post" id="formcon">
	  <div class="form-group">
	    <label for="exampleInputEmail1"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></label>
	    <input type="text" class="form-control" id="number" placeholder="请输入账号" name = "userName">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputPassword1"><span class="glyphicon glyphicon-lock" aria-hidden="true"></span></label>
	    <input type="password" class="form-control" id="password" placeholder="请输入密码" name = "userPassword">
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