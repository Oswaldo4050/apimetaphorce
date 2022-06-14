package com.example.apimetaphorce.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.apimetaphorce.models.employee;
import com.example.apimetaphorce.services.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class employeecontroller {
    @Autowired
    employeeservice employeeService;   

    @GetMapping()
    public ArrayList<employee> getEmployee(){
        return employeeService.getEmployees();
    }

    @PostMapping()
    public employee postEmployee(@RequestBody employee employee){
        return this.employeeService.postEmployee(employee);
    }
}
