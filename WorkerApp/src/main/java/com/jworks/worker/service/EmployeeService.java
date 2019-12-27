package com.jworks.worker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jworks.worker.dao.EmployeeDao;
import com.jworks.worker.domain.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empDao;
	public int addEmployee(Employee employee) {
		
		return empDao.createEmployee(employee);
	}
	public Employee getEmployee(long id) {
		return empDao.getEmployeeById(id);
	}
	public List<Employee> getAllEmployee() {
		return empDao.getAllEmployees();
	}
}
