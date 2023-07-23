package com.soninisha.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soninisha.ems.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
