package com.netcracker.dao;

import com.netcracker.model.BankAccount;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Repository("bankAccDAO")
@Transactional
public class BankAccDAO extends BasicDAO implements Dao<BankAccount> {

    public List<BankAccount> getAllObjects() {
        Criteria criteria = getSession().createCriteria(BankAccount.class);
        return criteria.list();
    }

    public BankAccount getObject(BigInteger id) {
        Criteria criteria = getSession().createCriteria(BankAccount.class);
        criteria.add(Restrictions.eq("id",id));
        return (BankAccount) criteria.uniqueResult();
    }

    public String getEntityName() {
        return BankAccount.class.getSimpleName();
    }

    public void add(BankAccount entity) {
        persist(entity);
    }

    public int deleteById(int id) {
        Query query = getSession().createQuery("delete from BankAccount where id = :id");
        query.setInteger("id",id);
        return query.executeUpdate();
    }
}
