package com.example.apimetaphorce.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.apimetaphorce.models.employee;
import com.example.apimetaphorce.repositories.employeerepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeservice {

    @Autowired
    employeerepository employeeRepository;
    
    public ArrayList<employee> getEmployees(){
        return (ArrayList<employee>) employeeRepository.findAll();
    }

    public employee postEmployee(employee employee){
        return employeeRepository.save(employee);
    }
}
