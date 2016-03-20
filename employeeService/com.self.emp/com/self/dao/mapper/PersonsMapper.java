package com.self.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.self.dto.Persons;

public class PersonsMapper implements RowMapper<Persons>{

	public Persons mapRow(ResultSet result, int arg1) throws SQLException {
		Persons person = new Persons();
		person.setEmpno(result.getInt(1));
		person.setEname(result.getString(2));
		person.setJob(result.getString(3));
		person.setMgr(result.getString(4));
		person.setHiredate(result.getDate(5));
		person.setSal(result.getDouble(6));
		person.setComm(result.getDouble(7));
		person.setDepto(result.getInt(8));
		return person;
	}

}
