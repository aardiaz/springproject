package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.Employee;
import com.bway.springproject.service.DepartmentService;
import com.bway.springproject.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private  DepartmentService  deptService;
	
	@GetMapping("/employee")
	public String getEmp(Model model) {
		
		model.addAttribute("dlist",deptService.getAllDepts());
		return "EmployeeForm";
	}

	@PostMapping("/employee")
	public  String postEmp(@ModelAttribute Employee employee) {
		
		empService.addEmployee(employee);
		return "redirect:/employee";
	}
}
