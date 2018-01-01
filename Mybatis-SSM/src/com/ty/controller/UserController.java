package com.ty.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.entity.Employee;
import com.ty.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/success")
	public String test(Map<String, Object> map){
		//---------通过id发现单个员工-----------------
//		Employee employee = userService.testService(3);
//		System.out.println("employee:"+employee);
//		map.put("employee", employee);
		//---------------发现全部员工----------------
		List<Employee> employees = userService.findAllEmps();
		map.put("employee", employees);
		System.out.println("-------------------success-----------------------");
		return "list";
	}
}
