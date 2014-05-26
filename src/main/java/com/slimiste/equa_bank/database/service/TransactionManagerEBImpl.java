package com.slimiste.equa_bank.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slimiste.equa_bank.database.dao.TransactionDAO;
import com.slimiste.equa_bank.database.entity.TransactionEntity;

@Service
public class TransactionManagerEBImpl implements TransactionManagerEB {

	@Autowired
	private TransactionDAO transactionDao;
	
	@Transactional
	public void addTransaction(TransactionEntity transaction) {
		this.transactionDao.addTransaction(transaction);
	}

	@Transactional
	public List<TransactionEntity> getAllTransaction() {
		return this.transactionDao.getAllTransaction();
	}

	@Transactional
	public void deleteTransaction(Integer transactionId) {
		this.transactionDao.deleteTransaction(transactionId);
	}
}
