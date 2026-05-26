package com.gusMkt.catalogService.controller;

import com.gusMkt.catalogService.model.Employee;
import com.gusMkt.catalogService.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Optional;

@RestController
@RequestMapping("/funcionarios")
public class EmployeeController {
    private final EmployeeService service;
    private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/{registration}")
    public ResponseEntity<?> findByRegistration(@PathVariable String registration) {
        if (registration == null || registration.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(Collections.singletonMap("error", "Matrícula inválida"));
        }

        Optional<Employee> employee = service.findByRegistration(registration);
        if (employee.isPresent()) {
            logger.info("Employee found for registration={}", registration);
            return ResponseEntity.ok(employee.get());
        } else {
            logger.info("Employee not found for registration={}", registration);
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Collections.singletonMap("error", "Funcionário não encontrado"));
        }
    }
}
