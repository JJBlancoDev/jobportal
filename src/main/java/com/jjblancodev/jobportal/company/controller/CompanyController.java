package com.jjblancodev.jobportal.company.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/companies")
public class CompanyController {

    @RequestMapping(version = "1.0", method = RequestMethod.GET)
    public ResponseEntity<String> getAllCompanies() {
        return ResponseEntity.ok("call to method getAllCompany v1.0");
    }
}
