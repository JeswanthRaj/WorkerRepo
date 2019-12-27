package com.jworks.worker;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jworks.worker.dao.EmployeeDao;
import com.jworks.worker.dao.impl.EmployeeDaoImpl;
import com.jworks.worker.domain.Employee;
import com.jworks.worker.service.EmployeeService;

public class WorkerApp {

	public static void main(String[] args) {
		
		ApplicationContext appCtxt=new ClassPathXmlApplicationContext("workerapp-context.xml");
		EmployeeService service=(EmployeeService)appCtxt.getBean("employeeService");
		Employee employee=new Employee();
		employee.setEmpId(2);
		employee.setFirstName("Praisy");
		employee.setLastName("Ravichandran");
		employee.setGender("F");
		employee.setAge(29);
		
		//service.addEmployee(employee);
		//System.out.println(service.getEmployee(2));
		System.out.println(service.getAllEmployee());
	}

}
