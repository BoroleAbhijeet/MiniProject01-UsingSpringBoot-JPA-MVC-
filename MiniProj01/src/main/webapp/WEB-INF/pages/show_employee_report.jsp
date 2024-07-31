<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${!empty empsList}">
<h1 style="color: red;text-align: center;">Employee Report</h1>
<table border="1" bgcolor="cyan" align="center">
<tr>
<th>empno</th><th>emp name</th><th>job</th><th>salary</th>
</tr>
<c:forEach var="emp" items="${empsList}">
<tr>
<td>${emp.empno}</td>
<td>${emp.empname}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td>          </td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color: red;text-align: center;">Employee Not Found</h1>
</c:otherwise>

</c:choose>


</body>
</html>