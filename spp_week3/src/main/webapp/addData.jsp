<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/articleType/typedatasave.do" method="post">
		<table>
			<tr>
				<td>添加数据：</td>
				<td>
					<input type="file" id="dataFile" name="dataFile"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交"></input>
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>