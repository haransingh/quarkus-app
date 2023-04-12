package org.acme.service;

import org.acme.entity.Employee;
import org.acme.pdo.EmployeeRequest;
import org.acme.pdo.EmployeeResponse;
import org.acme.repository.EmployeeRepository;

public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }
    public EmployeeResponse create(EmployeeRequest request) {
        Employee employee = Employee.builder()
                .name(request.getName())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .build();
        repository.save(employee);
        return new EmployeeResponse(employee.getId(), employee.getName(), employee.getEmail(), employee.getPhoneNumber());
    }
}
