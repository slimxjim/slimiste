package com.slimiste.equa_bank.database.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.slimiste.equa_bank.database.entity.TransactionEntity;

public class TransactionDaoImpl implements TransactionDAO {

	@Autowired
    @Qualifier(value="sessionFactoryEquaBank")
    private SessionFactory sessionFactory;
	
	@Override
	public void addTransaction(TransactionEntity transaction) {
		this.sessionFactory.getCurrentSession().save(transaction);
	}

	@Override
	public List<TransactionEntity> getAllTransaction() {
		@SuppressWarnings("unchecked")
		List<TransactionEntity> list = this.sessionFactory.getCurrentSession().createQuery("from TransactionEntity").list();
		return list;
	}

	@Override
	public void deleteTransaction(Integer transactionId) {
		TransactionEntity transaction = (TransactionEntity) sessionFactory.getCurrentSession().load(
				TransactionEntity.class, transactionId);
        if (null != transaction) {
            this.sessionFactory.getCurrentSession().delete(transaction);
        }
	}
}
