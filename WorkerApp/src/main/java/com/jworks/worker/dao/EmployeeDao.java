package com.jworks.worker.dao;

import java.util.List;

import com.jworks.worker.domain.Employee;

public interface EmployeeDao {

	public int createEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(Employee employee);
	public Employee getEmployeeById(long empId);
	public Employee getEmployeeByName(String firstName, String lastName);
	public List<Employee> getAllEmployees();
}
