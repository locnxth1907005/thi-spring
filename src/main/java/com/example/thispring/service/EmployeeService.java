package com.example.thispring.service;

import com.example.thispring.entity.Employee;
import com.example.thispring.repository.JPAEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    public JPAEmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> findAll() {return employeeRepository.findAll();}
}
