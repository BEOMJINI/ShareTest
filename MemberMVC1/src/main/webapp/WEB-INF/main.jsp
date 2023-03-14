<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="MemberVO" items="${list}" varStatus="st">
<table>
<tr><td>${MemberVO.id}</td>
<td>${MemberVO.pass}</td>
<td>${MemberVO.name}</td>
<td>${MemberVO.age}</td>
<td>${MemberVO.email}</td>
<td>${MemberVO.phone}</td></tr>
</table>





</c:forEach>
</body>
</html>