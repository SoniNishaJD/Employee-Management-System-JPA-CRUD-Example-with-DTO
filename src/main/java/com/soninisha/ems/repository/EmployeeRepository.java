package com.soninisha.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soninisha.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
