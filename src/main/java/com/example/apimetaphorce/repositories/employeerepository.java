package com.example.apimetaphorce.repositories;

import java.util.ArrayList;

import com.example.apimetaphorce.models.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeerepository extends CrudRepository<employee, Long> {
    //public abstract ArrayList<employee> 

}