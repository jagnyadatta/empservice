package com.self.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.self.dao.impl.EmployeDaoImpl;

import com.self.dto.Persons;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeDaoImpl emp;
	@RequestMapping("/emps/no")
    public Integer message(String player) {
 
        return  emp.fethAllEmpCount();
       
    }

}
