package com.slimiste.equa_bank.service;

import java.util.List;

import com.slimiste.equa_bank.entity.TransactionEntity;

public interface TransactionManagerEB 
{
    public void addTransaction(TransactionEntity transaction);
    public List<TransactionEntity> getAllTransaction();
    public void deleteTransaction(Integer transactionId);
}