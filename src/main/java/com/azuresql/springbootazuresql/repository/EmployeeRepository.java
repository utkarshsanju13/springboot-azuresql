package com.azuresql.springbootazuresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azuresql.springbootazuresql.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
