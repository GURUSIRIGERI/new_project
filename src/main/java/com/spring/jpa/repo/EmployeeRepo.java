package com.spring.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
