<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee registration </title>
</head>
<body>
<h1 style="color: red;text-align: center;"> Register Employee</h1>
<frm:form modelAttribute="emp">
<table align="center" bgcolor="cyan">
<tr>
<td>Employee Name::</td>
<td><frm:input path="ename"/></td>
</tr>
<tr>
<td>Employee Job::</td>
<td><frm:input path="job"/></td>
</tr>
<tr>
<td>Employee Salary::</td>
<td><frm:input path="sal"/></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="cancel"></td>
</tr>
</table>
</frm:form>
</body>
</html>