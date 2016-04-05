package com.self.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.self.dao.impl.EmployeDaoImpl;
import com.self.dto.Persons;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeDaoImpl emp;
	
	/**
	 * 
	 * This method returns the No. of emps Exists in the System. 
	 * 
	 * @return count
	 */
	@RequestMapping("emps/no")
    public Integer empCount() { 
        return  emp.fethAllEmpCount();       
    }
	/**
	 * 
	 * This Method returns list of employees Details
	 * 
	 * @return emps
	 */
	
	@RequestMapping("emps")
    public List<Persons> allEmployeeDetails() { 
        return  emp.fethAllEmpDetails();       
    }
	/**
	 * 
	 * This Method returns list of employees Details of particular Deptno
	 * 
	 * @param deptno
	 * @return
	 */
	
	@RequestMapping("emp/deptno/{deptno}")
    public List<Persons> allEmployeeByDept(@PathVariable String deptno) { 
        return  emp.fetchAllEmployeeByLastDeptNo(deptno);       
    }
	
	/**
	 * 
	 * This Method returns list of employees Details of particular Job
	 * 
	 * @param deptno
	 * @return
	 */

	@RequestMapping("emp/job/{job}")
    public List<Persons> allEmployeeJob(@PathVariable String job) { 
        return  emp.fetchAllEmployeeByLastJob(job);       
    }
	
	/**
	 * 
	 * This Method returns list of employees Details of particular empno
	 * 
	 * @param deptno
	 * @return
	 */
	@RequestMapping("emp/empno/{empno}")
    public List<Persons> allEmployeeByEmpno(@PathVariable String empno) { 
        return  emp.fetchAllEmployeeByEmpno(empno);       
    }
	
	/**
	 * 
	 * This Method returns list of employees Details of particular empNmae
	 * 
	 * @param deptno
	 * @return
	 */
	
	@RequestMapping("emp/ename/{empName}")
    public List<Persons> allEmployeeByName(@PathVariable String empName) { 
        return  emp.fetchAllEmployeeByEName(empName);       
    }
}
