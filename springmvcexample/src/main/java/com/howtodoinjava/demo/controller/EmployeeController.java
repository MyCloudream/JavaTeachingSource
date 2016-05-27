package com.howtodoinjava.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.EmployeeVO;
import com.howtodoinjava.demo.service.EmployeeManager;

@RestController
@RequestMapping("/employee-module")
public class EmployeeController {
	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public @ResponseBody EmployeeVO getAllEmployees(@RequestParam(required=false) String name) {
		// model.addAttribute("employees", manager.getAllEmployees());
		// HashMap<String,String> map = new HashMap<String,String>();
		EmployeeVO ev = new EmployeeVO();
		ev.setFirstName("hello");
		ev.setLastName("world");
		return ev;
	}
}