<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();%>
<html>
<head>
<meta charset="UTF-8">
<title>商务学院会员登录页面</title>
<link type="text/css" rel="stylesheet" href="<%=path%>/pages/../static/css/style.css" >

</head>

<body>
<script src="web/static/js"></script>
		<div id="login_header">
			<img class="logo_img" alt="" src="../../static/img/logo1.gif" >
		</div>
			<div class="login_banner">
				<div id="l_content">
					<span class="login_word">欢迎登录</span>
				</div>
				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>商务学院会员</h1>
								<a href="regist.jsp">立即注册</a>
							</div>
							<div class="msg_cont">
								<b></b>
								<span class="errorMsg">请输入用户名和密码</span>
							</div>
							<div class="form">
								<form action="../../LoginServlet" method="post">
									<label>用户名称：</label>
									<input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1" name="username" />
									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1" name="password" />
									<br />
									<br />
									<label>验证码：</label>
									<input class="itxt" type="text" style="width: 80px" name="code_img">
									<img src="http://localhost:8080/Book_war_exploded/kaptcha.jpg" alt="" style="" id="code_img">
									<input type="submit" value="登录" id="sub_btn" />
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		<div id="bottom">
			<span>
				商务学院书城.Copyright &copy;2022
			</span>
		</div>
<script>
	$("#code_img").click(function (){
		this.src="http://localhost:8080/Book_war_exploded/kaptcha.jpg";
	})
</script>
</body>
</html>