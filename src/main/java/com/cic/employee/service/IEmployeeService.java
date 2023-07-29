package com.cic.employee.service;

import com.cic.employee.dto.Employee;

public interface IEmployeeService {
    String createEmployee(Employee employee);

    Employee getEmployee(String email);

    String updateEmployee(Employee employee);

    String deleteEmployee(String email);
}
