package com.jworks.worker.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jworks.worker.dao.EmployeeDao;
import com.jworks.worker.domain.Employee;

class EmployeeDaoImplTest {

	@Test
	void testCreateEmployee() {
		Employee emp=new Employee("Praisy","Ravichandran","F",29);
		EmployeeDao empDao=new EmployeeDaoImpl();
		empDao.createEmployee(emp);
	}

}
