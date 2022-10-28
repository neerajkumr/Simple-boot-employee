package com.neeraj.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.neeraj.domain.Employee;
import com.neeraj.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/all")
	public List<Employee> retrive() {
		return service.list();

	}

	@PostMapping
	public Employee create(@RequestBody Employee emp) {
		return service.insert(emp);

	}

	@GetMapping(path = "/{id}")
	public Employee getListById(@PathVariable Long id) {
		return service.getById(id);

	}

	@DeleteMapping(path = "/{id}")
	public List<Employee> deleteById(@PathVariable Long id) {
		service.deleteById(id);
		return service.list();

	}

	@PutMapping
	public Employee update(@RequestBody Employee e) {
		return service.updateDetails(e);

	}
}
