package com.netcracker.service;

import com.netcracker.dao.ITransactionDAO;
import com.netcracker.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("transactionService")
public class TransactionServiceImpl implements ITransactionService {
    @Autowired
    ITransactionDAO transactionDAO;

    public List<Transaction> getAllTransactions() {
        return transactionDAO.getAllTransactions();
    }
}
