package com.spring.dao;

import com.spring.model.Employee;

public interface EmployeeDao {
	public void save(Employee e);
	public Employee get(int eno);
}
