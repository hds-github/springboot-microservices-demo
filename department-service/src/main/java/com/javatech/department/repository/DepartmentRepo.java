package com.javatech.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatech.department.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
