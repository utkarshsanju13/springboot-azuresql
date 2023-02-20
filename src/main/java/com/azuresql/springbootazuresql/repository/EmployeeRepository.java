package com.azuresql.springbootazuresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.azuresql.springbootazuresql.entity.Employee;

@Service
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
