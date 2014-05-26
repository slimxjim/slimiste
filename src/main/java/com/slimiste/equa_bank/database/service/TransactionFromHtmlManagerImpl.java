package com.slimiste.equa_bank.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slimiste.equa_bank.database.dao.TransactionFromHtmlDAO;
import com.slimiste.equa_bank.database.entity.TransactionFromHtmlEntity;

@Service
public class TransactionFromHtmlManagerImpl implements TransactionFromHtmlManager {

    @Autowired
    private TransactionFromHtmlDAO transactionFromHtmlDAO;

    @Transactional
    public void addTransaction(TransactionFromHtmlEntity transaction) {
        this.transactionFromHtmlDAO.addTransaction(transaction);
    }

    @Transactional
    public List<TransactionFromHtmlEntity> getAllTransaction() {
        return this.transactionFromHtmlDAO.getAllTransaction();
    }

    @Transactional
    public void deleteTransaction(Integer transactionId) {
        this.transactionFromHtmlDAO.deleteTransaction(transactionId);
    }
}
