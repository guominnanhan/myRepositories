<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/article/list.do" method="post">
		<table>
			<tr>
				<th colspan="2">文章信息</th>
			</tr>
			<tr>
				<td>标题</td>
				<td>
					<input type="text" name="title" value="${article.title }"></input>
				</td>
			</tr>
			<tr>
				<td>内容</td>
				<td>
					<input type="text" name="content" value="${article.content }"></input>
				</td>
			</tr>
			<tr>
				<td>日期</td>
				<td>
					<input type="text" name="publicDate" value="${article.publicDate }"></input>
				</td>
			</tr>
			<tr>
				<td>类别</td>
				<td>
					<input type="text" name="typeId" value="${article.typeId }"></input>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="hidden" name="id" value="${article.id }"></input>
					<input type="submit" value="确定"></input>
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>