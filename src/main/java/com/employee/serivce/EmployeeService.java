package com.employee.serivce;

import com.employee.modal.Employee;

public interface EmployeeService {
	
	public Employee loginEmployee(String email, String Password);
	
	public Employee addEmployee(Employee employee);
	
	public Employee viewEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee deleteEmployee(int empNo);

}
