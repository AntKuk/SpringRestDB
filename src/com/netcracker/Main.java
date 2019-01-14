package com.netcracker;

import com.netcracker.config.SpringConfig;
import com.netcracker.service.ICompanyService;
import com.netcracker.service.ITransactionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ITransactionService companyService = (ITransactionService) context.getBean("transactionService");
        System.out.println(companyService.getAllTransactions());
    }

  //HELLO
}
