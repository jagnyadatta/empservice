package com.self.dao.impl;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.self.dao.query.constants.EmpQueryConstants;

@Repository
public class EmployeDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Integer fethAllEmployee(){
		System.out.println("Hello..........." +jdbcTemplate);
	
		return jdbcTemplate.queryForInt(EmpQueryConstants.FETCH_ALL_EMPLOYEE_COUNT)	;
		
		
		
	}
	

	
}
