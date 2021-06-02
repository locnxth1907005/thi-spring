package com.example.thispring.controller;

import com.example.thispring.entity.Employee;
import com.example.thispring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/demo")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping(value = "/createEmployee")
    public Employee save(@RequestBody Employee employee){

        return employeeService.createEmployee(employee);
    }

    @Deprecated
    @GetMapping(value = "/findallemployee")
    public Iterable<Employee> findAll(){
        return employeeService.findAll() ;

    }

}
