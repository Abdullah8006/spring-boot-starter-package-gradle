/**
 * 
 *//*
package com.abdullah.examples.thymeleaf.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abdullah.examples.thymeleaf.entity.Employee;
import com.abdullah.examples.thymeleaf.repository.MyCassandraUtility;

*//**
 * 
 * 
 *
 * @author Abdullah Gorakhpur
 * @version 1.0
 * @since May 10, 2017
 *//*
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private MyCassandraUtility myCassandraTemplate;

	@Override
	public Employee createEmployee(Employee employee) {
		return myCassandraTemplate.create(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		return myCassandraTemplate.findById(id, Employee.class);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return myCassandraTemplate.update(employee, Employee.class);
	}

	@Override
	public void deleteEmployee(int id) {
		myCassandraTemplate.deleteById(id, Employee.class);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return myCassandraTemplate.findAll(Employee.class);
	}

}
*/