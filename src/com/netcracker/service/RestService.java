package com.netcracker.service;

import com.netcracker.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestService {
    @Autowired
    ICompanyService companyService;

    @GetMapping(value = "/company", produces = "application/json")
    public ResponseEntity<List<Company>> getAllCompanies() {
        List<Company> list = companyService.getAllCompanies();
        if(list.isEmpty()) {
            return new ResponseEntity<List<Company>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Company>>(list, HttpStatus.OK);
    }


}
