package com.self.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.self.dao.impl.EmployeDaoImpl;



@RestController
public class EmployeeController {
	{
		System.out.println("Hiiii...........");
	}
	@Autowired
	private EmployeDaoImpl emp;
	@RequestMapping("emps/no")
    public Integer message() { 
        return  emp.fethAllEmpCount();       
    }

}
