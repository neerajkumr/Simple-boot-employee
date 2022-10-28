package com.neeraj.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neeraj.dao.EmployeeDAO;
import com.neeraj.domain.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	public List<Employee> list() {
		return dao.findAll();
	}

	public Employee insert(Employee emp) {
		return dao.save(emp);

	}

	public Employee getById(Long id) {
		if (dao.findAll() != null) {
			return dao.findById(id).get();
		} else {
			return null;
		}
	}

	public List<Employee> deleteById(Long id) {
		if (dao.findAll() != null) {
			dao.deleteById(id);
		}
		return dao.findAll();

	}

	public Employee updateDetails(Employee e) {
		if (dao.findAll() != null) {
		 dao.save(e);
		}
		return e;
	}
}
