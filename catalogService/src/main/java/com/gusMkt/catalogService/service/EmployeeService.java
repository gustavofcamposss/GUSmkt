package com.gusMkt.catalogService.service;

import com.gusMkt.catalogService.model.Employee;
import com.gusMkt.catalogService.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Optional<Employee> findByRegistration(String registration) {
        return repository.findByRegistration(registration);
    }
}
