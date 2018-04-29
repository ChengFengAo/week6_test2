package com.example.employeeapi.controller;

import com.example.employeeapi.datasource.EmployeeRepository;
import com.example.employeeapi.datasource.TestEmployeeRepository;
import com.example.employeeapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @RequestMapping("/employees")
    String getEmployees(Model  modle) {
        modle.addAttribute("getAllEmployee", employeeRepository.getAllEmployees());
        return "employees";
    }


    @GetMapping("/employees/{id}")
    ResponseEntity getEmployee(@PathVariable("id") int id) {
        return new ResponseEntity<>(employeeRepository.getEmployee(id), HttpStatus.OK);
    }
}
