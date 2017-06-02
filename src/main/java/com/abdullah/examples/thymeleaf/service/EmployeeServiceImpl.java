/**
 * 
 *//*
package com.abdullah.examples.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abdullah.examples.thymeleaf.dao.EmployeeDao;
import com.abdullah.examples.thymeleaf.entity.Employee;

*//**
 *
 * @author Abdullah Gorakhpur
 * @version 1.0
 * @since May 10, 2017
 *//*
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDAO;

	*//**
	 * Default Constructor
	 *//*
	public EmployeeServiceImpl() {
		super();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeDAO.getEmployee(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDAO.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

}
*/