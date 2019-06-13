<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>
<tr>
		<td>
			<a href="${pageContext.request.contextPath}/article/list.do">查看</a>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/add.jsp ">添加文章</a>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/typelist.jsp ">文章类别</a>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath}/article/onemonthlist.do">一月内</a>
		</td>
</tr>

	<tr>
		<th>编号</th>
		<th>标题</th>
		<th>类型</th>
	</tr>
	<c:forEach var="article" items="${articleList }">
		<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;${article.id } </td>
			<td>${article.title }&nbsp;&nbsp;</td>
			<td>${article.typeId }&nbsp;&nbsp;</td>
			<td>
				<a href="${pageContext.request.contextPath}/article/desc.do?id=${article.id} ">详情</a>
				&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath}/article/preSave.do?id=${article.id} ">修改</a>
				&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath}/article/delete.do?id=${article.id} ">删除</a>				
			</td>
	    </tr>
	</c:forEach>

</table>
</body>
</html>