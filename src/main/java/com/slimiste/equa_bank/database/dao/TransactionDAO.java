package com.slimiste.equa_bank.dao;

import java.util.List;

import com.slimiste.equa_bank.entity.TransactionEntity;

public interface TransactionDAO 
{
    public void addTransaction(TransactionEntity transaction);
    public List<TransactionEntity> getAllTransaction();
    public void deleteTransaction(Integer transactionId);
}