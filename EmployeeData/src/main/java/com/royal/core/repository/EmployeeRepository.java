package com.royal.core.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.royal.core.entity.Employee;

@Repository
public class EmployeeRepository {

    private final Map<Integer, Employee> employeeDb = new HashMap<>(); // fake DB
    private int currentId = 1;

    public List<Employee> findAll() {
        return new ArrayList<>(employeeDb.values());
    }

    public Employee findById(int id) {
        return employeeDb.get(id);
    }

    public void save(Employee employee) {
        if (employee.getEmp_id() == 0) {
            employee.setEmp_id(currentId++);
        }
        employeeDb.put(employee.getEmp_id(), employee);
    }

    public void update(Employee employee) {
        if (employeeDb.containsKey(employee.getEmp_id())) {
            employeeDb.put(employee.getEmp_id(), employee);
        }
    }

    public void delete(int id) {
        employeeDb.remove(id);
    }
}