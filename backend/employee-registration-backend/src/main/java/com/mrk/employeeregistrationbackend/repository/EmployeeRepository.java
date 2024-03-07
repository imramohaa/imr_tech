package com.mrk.employeeregistrationbackend.repository;

// src/main/java/com/example/employeeregistrationbackend/repository/EmployeeRepository.java

import com.mrk.employeeregistrationbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

