<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<script type="text/javascript"
	src="resources/script/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#button_submit").click(function() {
			var _name = $("#userName").val();
			var _pass = $("#password").val();
			
			var user = { name: _name, password: _pass };
			$.ajax({
				type:"POST",
				url:"${pageContext.request.contextPath}/login",
				data:user,
				success:function(data) {
					alert(data.code);
					alert("成功");
				},
				error:function(e) {
					console.log(e.responseText);
					alert("出错"+e);
				}
			});
		});
	});
</script>
<body>
	<table>
		<tr>
			<td>账号</td>
			<td><input type="text" id="userName" name="name"></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" id="password" name="password">
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><input type="button" id="button_submit" value="提交">
			</td>
		</tr>
	</table>
</body>
</html>