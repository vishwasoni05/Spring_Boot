<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
<h2>Employee Form</h2>

<form action="/employees/save" method="post">
    <input type="hidden" name="emp_id" value="${employee.emp_id}" />

    Name: <input type="text" name="name" value="${employee.name}" /><br><br>
    First Name: <input type="text" name="first_name" value="${employee.first_name}" /><br><br>
    Last Name: <input type="text" name="last_name" value="${employee.last_name}" /><br><br>
    Department: <input type="text" name="department" value="${employee.department}" /><br><br>
    Salary: <input type="number" step="0.01" name="salary" value="${employee.salary}" /><br><br>
    Experience (Years): <input type="number" name="experience" value="${employee.experience}" /><br><br>
    Joining Date: <input type="date" name="joining_data" value="${employee.joining_data}" /><br><br>
    Date of Birth: <input type="date" name="date_of_birth" value="${employee.date_of_birth}" /><br><br>
    City: <input type="text" name="city" value="${employee.city}" /><br><br>
    State: <input type="text" name="state" value="${employee.state}" /><br><br>
    Country: <input type="text" name="country" value="${employee.country}" /><br><br>
    Zip Code: <input type="number" name="zip_code" value="${employee.zip_code}" /><br><br>

    <button type="submit">Save</button>
</form>

</body>
</html>
