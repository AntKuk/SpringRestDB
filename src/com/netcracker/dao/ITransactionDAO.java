package com.netcracker.dao;

import com.netcracker.model.Transaction;

import java.util.List;

public interface ITransactionDAO {
    List<Transaction> getAllTransactions();
}
