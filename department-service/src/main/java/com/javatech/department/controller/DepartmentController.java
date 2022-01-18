package com.javatech.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.department.entity.Department;
import com.javatech.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService depService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("inside saveDepartment- Controller");
		return depService.save(department);
	}
	
	@GetMapping("/{depId}")
	public Department getDepartmentbyId(@PathVariable Long depId) {
		
		return depService.getDepartmentById(depId);
	}
}
