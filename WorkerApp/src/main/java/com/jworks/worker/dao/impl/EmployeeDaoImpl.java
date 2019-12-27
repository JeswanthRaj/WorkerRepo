package com.jworks.worker.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.jworks.worker.dao.EmployeeDao;
import com.jworks.worker.domain.Employee;
import com.jworks.worker.mapper.EmployeeResultMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public int createEmployee(Employee employee) {
		
	String sql="INSERT INTO EMPLOYEE VALUES (?,?,?,?,?)";
	//Object params[]= new Object[]{employee.getEmpId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getAge()};
	
	return jdbc.update(sql,employee.getEmpId(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getAge());
		
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Employee getEmployeeById(long empId) {
		String sql="SELECT * FROM EMPLOYEE WHERE ID=?";
		
		return jdbc.queryForObject(sql,new Object[] {empId} ,new EmployeeResultMapper());
	}

	@Override
	public Employee getEmployeeByName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql="SELECT * FROM EMPLOYEE";
		return jdbc.query(sql, new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> empList=new ArrayList<Employee>();
				while(rs.next()) {
					Employee employee = new Employee();
					employee.setEmpId(rs.getLong("ID"));
					employee.setFirstName(rs.getString("FNAME"));
					employee.setLastName(rs.getString("LNAME"));
					employee.setGender(rs.getString("GENDER"));
					employee.setAge(rs.getInt("AGE"));
					empList.add(employee);	
				}
				return empList;
			}
		});
	}

	

}
