package com.netcracker.service;

import com.netcracker.dao.ICompanyDAO;
import com.netcracker.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("companyService")
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    ICompanyDAO companyDAO;

    public List<Company> getAllCompanies() {
        return companyDAO.getAllCompanies();
    }
}
