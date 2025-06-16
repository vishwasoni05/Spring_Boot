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

<form action="/employees/update" method="post">
    <input type="hidden" name="emp_id" value="${employee.emp_id}" />

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${employee.name}" /><br><br>

    <label for="first_name">First Name:</label>
    <input type="text" id="first_name" name="first_name" value="${employee.first_name}" /><br><br>

    <label for="last_name">Last Name:</label>
    <input type="text" id="last_name" name="last_name" value="${employee.last_name}" /><br><br>

    <label for="department">Department:</label>
    <input type="text" id="department" name="department" value="${employee.department}" /><br><br>

    <label for="salary">Salary:</label>
    <input type="number" id="salary" name="salary" step="0.01" value="${employee.salary}" /><br><br>

    <label for="experience">Experience (Years):</label>
    <input type="number" id="experience" name="experience" value="${employee.experience}" /><br><br>

    <label for="joining_data">Joining Date:</label>
    <input type="date" id="joining_data" name="joining_data" value="${employee.joining_data}" /><br><br>

    <label for="date_of_birth">Date of Birth:</label>
    <input type="date" id="date_of_birth" name="date_of_birth" value="${employee.date_of_birth}" /><br><br>

    <label for="city">City:</label>
    <input type="text" id="city" name="city" value="${employee.city}" /><br><br>

    <label for="state">State:</label>
    <input type="text" id="state" name="state" value="${employee.state}" /><br><br>

    <label for="country">Country:</label>
    <input type="text" id="country" name="country" value="${employee.country}" /><br><br>

    <label for="zip_code">Zip Code:</label>
    <input type="number" id="zip_code" name="zip_code" value="${employee.zip_code}" /><br><br>

    <button type="submit">Save</button>
</form>

</body>
</html>
