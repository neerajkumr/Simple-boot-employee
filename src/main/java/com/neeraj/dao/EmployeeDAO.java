package com.neeraj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neeraj.domain.Employee;


@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

	
}