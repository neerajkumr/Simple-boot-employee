package com.neeraj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neeraj.dao.EmployeeDAO;
import com.neeraj.domain.Employee;

@RestController
public class EmployeeController {
	
	
		@Autowired
		private EmployeeDAO dao;

		@GetMapping(path = "/employee/list")
		public List<Employee> list() {
			return dao.findAll();

		}

		@PostMapping(path = "/employee/insert")
		public Employee create(@RequestBody Employee emp) {
			return dao.save(emp);
			
		}

		@GetMapping(path = "/employee/employeebyID/{id}")
		public Optional<Employee> getById(@PathVariable Long id) {
			return dao.findById(id);

		}

		@DeleteMapping(path = "/employee/delbyID/{id}")
		public List<Employee> deleteById(@PathVariable Long id) {
			dao.deleteById(id);
			return dao.findAll();

		}

		@PutMapping(path="/employee/update/")
		public Employee updateDetails(@RequestBody Employee e){
			return dao.save(e);
			
		}
	}


