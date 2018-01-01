package com.ty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.dao.EmployeeMapper;
import com.ty.entity.Employee;

@Service
public class UserService {
	@Autowired
	private EmployeeMapper employeeMapper;

	public Employee testService(Integer id) {
		System.out.println("hello");
		return employeeMapper.getEmployById(id);
	}
	
	public List<Employee> findAllEmps(){
		return employeeMapper.getEmps();
	}
}
