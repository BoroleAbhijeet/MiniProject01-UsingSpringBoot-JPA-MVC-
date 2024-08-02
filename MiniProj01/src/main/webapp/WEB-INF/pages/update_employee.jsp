<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee page</title>
</head>
<body>
	<h1 style="color: red;text-align: center;">Update Employee</h1>
	<frm:form modelAttribute="emp">
		<table align="center" bgcolor="cyan">
		<tr>
		<td> Employee Number::</td>
		<td><frm:input path="empno" readonly="true"/></td>
		</tr>
		<tr>
		<td> Employee Name::</td>
		<td><frm:input path="ename" /></td>
		</tr>
		<tr>
		<td> Employee Job::</td>
		<td><frm:input path="job" /></td>
		</tr>
		<tr>
		<td> Employee Salary::</td>
		<td><frm:input path="sal"/></td>
		</tr>
		<tr>
		<td> <input type="submit" value="Update Employee"></td>
		<td><input type="reset" value="cancle"></td>
		</tr>
		</table>
	</frm:form>
</body>
</html>