package com.neeraj.service;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.neeraj.dao.EmployeeDAO;
import com.neeraj.domain.Employee;

@Service
public class EmployeeService {
	private static final Logger log = Logger.getLogger("service");
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
