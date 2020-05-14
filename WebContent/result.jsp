<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmployeeList</title>
<style>
	img{
		width: 200px;
		height: 200px;
	}
</style>
</head>
<body>
	<h1>EMPLOYEE LIST</h1>
	<table>
		<tr>
			<td>Name</td>
			<td>DOB</td>
			<td>Address</td>
			<td>Image</td>
		</tr>
		<c:forEach items="${empList}" var="employee">
			<tr>
				<td>${employee.getEmpName()}</td>
				<td>${employee.getEmpDob()}</td>
				<td>${employee.getEmpAddress()}</td>
				<td><img src="${employee.getEmpImage()}"></td>				
			</tr>
		</c:forEach>

	</table>
</body>
</html>