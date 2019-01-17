package com.netcracker.service;

import com.netcracker.dao.Dao;
import com.netcracker.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service("companyService")
public class CompanyService implements ServiceDB<Company>{

    private final Dao<Company> companyDao;

    @Autowired
    public CompanyService(@Qualifier("companyDAO") Dao<Company> companyDao) {
        this.companyDao = companyDao;
    }

    /*
        public List<Company> getAllCompanies() {
            return companyDAO.getAllCompanies();
        }
    */
    public List<Company> getAll() {
        return companyDao.getAllObjects();
    }

    public Company getById(BigInteger id) {
        return null;
    }

    public String getEntityName() {
        return companyDao.getEntityName();
    }
}
