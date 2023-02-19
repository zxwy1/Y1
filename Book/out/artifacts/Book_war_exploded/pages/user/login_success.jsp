<%@ page import="com.swxy.controller.LoginServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();%>
<html>
<head>
<meta charset="UTF-8">
	<title>商务学院会员登录页面</title>
	<link type="text/css" rel="stylesheet" href="<%=path%>/pages/../static/css/style.css" >

<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
</style>

</head>
<body>
		<div id="header">
				<div>
					<%
						LoginServlet loginServlet=new LoginServlet();
					%>
					<span>欢迎<span class="um_span"></span>光临商务学院书城</span>
					<a href="../order/order.jsp">我的订单</a>
					<a href="../../index.html">注销</a>&nbsp;&nbsp;
					<a href="<%=path%>/pages/user/login.jsp">返回</a>
				</div>
		</div>
		
		<div id="main">
		
			<h1>欢迎回来 <a href="">转到主页</a></h1>
	
		</div>

		<div id="bottom">
			<span>
				商务学院书城.Copyright &copy;2022
			</span>
		</div>
</body>
</html>