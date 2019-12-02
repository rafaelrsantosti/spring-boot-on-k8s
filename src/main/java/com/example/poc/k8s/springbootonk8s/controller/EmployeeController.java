package com.example.poc.k8s.springbootonk8s.controller;

import com.example.poc.k8s.springbootonk8s.model.Employee;
import com.example.poc.k8s.springbootonk8s.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostMapping(
        name = "/"
        , produces = {
            MediaType.APPLICATION_JSON_VALUE
            , MediaType.APPLICATION_XML_VALUE
        }
        , consumes = {
            MediaType.APPLICATION_JSON_VALUE
            , MediaType.APPLICATION_XML_VALUE
        }
    )
    public Employee post(@RequestBody Employee e) {
        return repository.save(e);
    }

    @GetMapping(
        value = "/{id}"
        , produces = {
            MediaType.APPLICATION_JSON_VALUE
            , MediaType.APPLICATION_XML_VALUE
        }
    )
    public Optional<Employee> get(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @GetMapping(
        name = "/"
        , produces = {
            MediaType.APPLICATION_JSON_VALUE
            , MediaType.APPLICATION_XML_VALUE
        }
    )
    public Iterable<Employee> list() {
        return repository.findAll();
    }
}
