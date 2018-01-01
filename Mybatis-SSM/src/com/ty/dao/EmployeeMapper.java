package com.ty.dao;
import java.util.List;

import com.ty.entity.Employee;
public interface EmployeeMapper {
	public Employee getEmployById(Integer id);
	
	public List<Employee> getEmps();
}
