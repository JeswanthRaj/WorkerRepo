package com.jworks.worker.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jworks.worker.domain.Employee;

@Component
public class EmployeeResultMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getLong("ID"));
		employee.setFirstName(rs.getString("FNAME"));
		employee.setLastName(rs.getString("LNAME"));
		employee.setGender(rs.getString("GENDER"));
		employee.setAge(rs.getInt("AGE"));
		return employee;
	}

	
}
