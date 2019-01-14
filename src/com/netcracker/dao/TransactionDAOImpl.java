package com.netcracker.dao;

import com.netcracker.model.Transaction;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("transactionDAO")
@Transactional
public class TransactionDAOImpl extends BasicDAO implements ITransactionDAO {
    public List<Transaction> getAllTransactions() {
        Criteria criteria = getSession().createCriteria(Transaction.class);
        List<Transaction> list = criteria.list();
        System.out.println();
        return criteria.list();
    }
}
