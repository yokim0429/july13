<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>board2 JSP</title>
</head>
<body>
	<h2>Board2: ${name}</h2>

	FN tag(function tag)
	<br> ${fn:length(list)} choose tag
	<c:choose>
		<c:when test="${fn:length(list) gt 0}">
			참이네요.
			<table>
				<tr>
					<td>번호</td>
					<td>제목</td>
					<td>글쓴이</td>
					<td>날짜</td>
					<td>읽음</td>
				</tr>
				<c:forEach items="${list}" var="row">
					<tr>
						<td>${row.bno}</td>
						<td>${row.btitle}</td>
						<td>${row.bwrite}</td>
						<td>${row.bdate}</td>
						<td>${row.blike}</td>
					</tr>
				</c:forEach>
			</table>

		</c:when>
		<c:otherwise>
			출력할 값이 없습니다 관리자에게 문의하시오.
		</c:otherwise>
	</c:choose>


</body>
</html>