package com.self.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.NoRepositoryBean;

import com.self.dto.Persons;




@NoRepositoryBean
public interface EmployeDao extends JpaRepository<Persons,Integer>{



}
