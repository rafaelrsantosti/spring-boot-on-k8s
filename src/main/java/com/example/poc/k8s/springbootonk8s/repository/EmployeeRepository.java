package com.example.poc.k8s.springbootonk8s.repository;

import com.example.poc.k8s.springbootonk8s.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
