<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
function _hyz(){
var img=document.getElementById("img");	

img.src="/tools/VerifyCodeServlet?a="+new Date().getTime();
}
</script>
</head>
<body>
<form action="/tools/LoginServlet" method="post">
<input type="hidden" name="method" value="login"/>
用户名：<input type="text" name="name"/><br/>
密    码：<input type="text" name="pwd"/><br/>
验证码:<input type="text" name="verifyCode"/><br/>
<img alt="" src="/tools/VerifyCodeServlet" id="img">
<a href="javascript:_hyz()">换一张</a>
<input type="submit" value="提交">
</form>
</body>
</html>