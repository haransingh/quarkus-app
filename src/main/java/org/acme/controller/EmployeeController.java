package org.acme.controller;

import org.acme.pdo.EmployeeRequest;
import org.acme.pdo.EmployeeResponse;
import org.acme.service.EmployeeService;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/employee")
public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }


    @POST
    public EmployeeResponse create(EmployeeRequest request) {
        return service.create(request);
    }
}
