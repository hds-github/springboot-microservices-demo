package com.javatech.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatech.department.entity.Department;
import com.javatech.department.repository.DepartmentRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired	
	private DepartmentRepo depRepo;
    
	
	/**
	 * This menthod is to persist the departments
	 * @param department
	 * @return
	 */
	public Department save(Department department) {
		System.out.println("inside saveDepartment- DepartmentService");
		return depRepo.save(department);
	}


	public Department getDepartmentById(Long depId) {
		return depRepo.findById(depId).orElse(null);
	}
}
