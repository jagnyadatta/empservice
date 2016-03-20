package com.self.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.self.dao.mapper.PersonsMapper;
import com.self.dao.query.constants.EmpQueryConstants;
import com.self.dto.Persons;

@Repository
public class EmployeDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Integer fethAllEmpCount() {
		return jdbcTemplate.queryForInt(EmpQueryConstants.FETCH_ALL_EMPLOYEE_COUNT);
	}

	public List<Persons> fetchAllEmployeeByEmpno(String empno) {
		return jdbcTemplate.query(EmpQueryConstants.FETCH_ALL_EMPLOYEE_EMPNO, new Object[] {  empno  },
				new PersonsMapper());
	}

	public List<Persons> fetchAllEmployeeByEName(String fname) {
		return jdbcTemplate.query(EmpQueryConstants.FETCH_ALL_EMPLOYEE_BY_ENAME, new Object[] { '%' + fname + '%' },
				new PersonsMapper());

	}

	public List<Persons> fetchAllEmployeeByLastDeptNo(String deptno) {
		return jdbcTemplate.query(EmpQueryConstants.FETCH_ALL_EMPLOYEE_DEPTNO, new Object[] { deptno  },
				new PersonsMapper());

	}
}
