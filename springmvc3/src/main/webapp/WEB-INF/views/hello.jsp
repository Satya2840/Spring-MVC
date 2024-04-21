<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.spring.mvc.controller.dto.Employee,java.util.List"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Spring MVC First Application</h2>
	<%
	out.print("id:" +request.getAttribute("id"));
	out.print("name:" +request.getAttribute("name"));
	out.print("Employee Details:" +request.getAttribute("employee"));
	List<Employee> emplist = (List<Employee>)request.getAttribute("employeeList");
	out.print("Employee Details List:");
	for(Employee emp: emplist) {
	out.println("id: "+emp.getId());
	out.println("name: "+emp.getName());
	out.println("Salary: "+emp.getSalary());
	}
	%>
</body>
</html>