package com.slimiste.equa_bank.database.service;

import java.util.List;

import com.slimiste.equa_bank.database.entity.TransactionFromHtmlEntity;

public interface TransactionFromHtmlManager
{
    public void addTransaction(TransactionFromHtmlEntity transaction);
    public List<TransactionFromHtmlEntity> getAllTransaction();
    public void deleteTransaction(Integer transactionId);
}