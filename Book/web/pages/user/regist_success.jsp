<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();%>
<html>
<head>
<meta charset="UTF-8">
<title>商务学院会员注册页面</title>
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

				<span class="wel_word"></span>
				<div>
					<span>欢迎<span class="um_span">韩总</span>光临商务学院书城</span>
					<a href="../order/order.jsp">我的订单</a>
					<a href="../../index.html">注销</a>&nbsp;&nbsp;
					<a href="../../index.html">返回</a>
				</div>
		</div>
		
		<div id="main">
		
			<h1>注册成功! <a href="../../index.html">转到主页</a></h1>
	
		</div>
		
		<div id="bottom">
			<span>
				商务学院书城.Copyright &copy;2022
			</span>
		</div>
</body>
</html>