package com.netcracker.service;
import com.netcracker.model.Transaction;

import java.util.List;

public interface ITransactionService {
    List<Transaction> getAllTransactions();

}
