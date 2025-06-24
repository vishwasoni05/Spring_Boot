<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<h2>Employee List</h2>
<a href="/employees/add">Add New Employee</a>
<table border="1">0
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Experience</th>
        <th>Joining Date</th>
        <th>Date of Birth</th>
        <th>City</th>
        <th>State</th>
        <th>Country</th>
        <th>Zip Code</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.emp_id}</td>
            <td>${emp.name}</td>
            <td>${emp.first_name}</td>
            <td>${emp.last_name}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>${emp.experience}</td>
            <td>${emp.joining_data}</td>
            <td>${emp.date_of_birth}</td>
            <td>${emp.city}</td>
            <td>${emp.state}</td>
            <td>${emp.country}</td>
            <td>${emp.zip_code}</td>
            <td>
                <a href="/employees/edit/${emp.emp_id}">Edit</a> |
                <a href="/employees/delete/${emp.emp_id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
