package com.gusMkt.catalogService.repository;

import com.gusMkt.catalogService.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Optional<Employee> findByRegistration(String registration);
}
