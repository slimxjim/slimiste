package com.slimiste.equa_bank.database.dao;

import java.util.List;

import com.slimiste.equa_bank.database.entity.TransactionFromHtmlEntity;

public interface TransactionFromHtmlDAO
{
    public void addTransaction(TransactionFromHtmlEntity transaction);
    public List<TransactionFromHtmlEntity> getAllTransaction();
    public void deleteTransaction(Integer transactionId);
}