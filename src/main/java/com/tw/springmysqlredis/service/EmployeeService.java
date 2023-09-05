package com.tw.springmysqlredis.service;

import com.tw.springmysqlredis.model.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {

    Employee findEmployeeById(Long id);

    Page<Employee> getAllEmployees(Integer page, Integer size);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Long id);

}
