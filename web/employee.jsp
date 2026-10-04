<%-- 
    Document   : employee
    Created on : 4 oct 2026, 10:51:00
    Author     : Adrian Cubero
--%>


<%@page import="java.util.List"%>
<%@page import="my.webapp.employee.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<title>Lista de Empleados</title>
</head>
<body>
 
<%
List<Employee> employeeList =
(List<Employee>) request.getAttribute("employeeList");
%>
 
<h1>Lista de Empleados</h1>
 
<ul>
 
<%
for(Employee employee : employeeList){
%>
 
<li>
<%= employee.getNombre() %>
-
<%= employee.getDepartamento() %>
</li>
 
<%
}
%>
 
</ul>
 
</body>
</html>