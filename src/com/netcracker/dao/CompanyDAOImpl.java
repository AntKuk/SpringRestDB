package com.netcracker.dao;

import com.netcracker.model.Company;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("companyDAO")
@Transactional
public class CompanyDAOImpl extends BasicDAO implements ICompanyDAO {

    public List<Company> getAllCompanies() {
        Criteria criteria = getSession().createCriteria(Company.class);
        return criteria.list();
    }
}
