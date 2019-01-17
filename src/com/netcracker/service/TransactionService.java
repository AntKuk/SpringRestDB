package com.netcracker.service;

import com.netcracker.dao.Dao;
import com.netcracker.model.Transact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service("transactionService")
public class TransactionService implements ServiceDB<Transact> {
    private final Dao<Transact> transactDao;

    @Autowired
    public TransactionService(@Qualifier("transactionDAO") Dao<Transact> transactDao) {
        this.transactDao = transactDao;
    }

    public List<Transact> getAll() {
        return transactDao.getAllObjects();
    }

    public Transact getById(BigInteger id) {
        return null;
    }

    public String getEntityName() {
        return transactDao.getEntityName();
    }

  /*  @Autowired
    ITransactionDAO transactionDAO;

    public List<Transact> getAllTransactions() {
        return transactionDAO.getAllTransactions();
    }*/
}
