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
				<a href="${pageContext.request.contextPath}/articleType/typelist.do">查看</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath}/typeadd.jsp ">添加类别</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath}/list.jsp ">文章列表</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath}/addData.jsp ">添加类别数据</a>
			</td>
	</tr>

	<tr>
		<th>编号</th>
		<th>类型</th>
	</tr>
	<c:forEach var="articleType" items="${articleTypeList }">
		<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;${articleType.id } </td>
			<td>${articleType.type }&nbsp;&nbsp;</td>
			<td>
				<a href="${pageContext.request.contextPath}/articleType/typedelete.do?id=${articleType.id} ">删除</a>				
			</td>
	    </tr>
	</c:forEach>

</table>
</body>
</html>