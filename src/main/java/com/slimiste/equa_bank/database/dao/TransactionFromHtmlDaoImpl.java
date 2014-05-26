package com.slimiste.equa_bank.database.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.slimiste.equa_bank.database.entity.TransactionFromHtmlEntity;

public class TransactionFromHtmlDaoImpl implements TransactionFromHtmlDAO {

    @Autowired
    @Qualifier(value="sessionFactoryEquaBank")
    private SessionFactory sessionFactory;

    @Override
    public void addTransaction(TransactionFromHtmlEntity transaction) {
        this.sessionFactory.getCurrentSession().save(transaction);
    }

    @Override
    public List<TransactionFromHtmlEntity> getAllTransaction() {
        @SuppressWarnings("unchecked")
        List<TransactionFromHtmlEntity> list = this.sessionFactory.getCurrentSession().createQuery("from TransactionFromHtmlEntity").list();
        return list;
    }

    @Override
    public void deleteTransaction(Integer transactionId) {
        TransactionFromHtmlEntity transaction = (TransactionFromHtmlEntity) sessionFactory.getCurrentSession().load(
                TransactionFromHtmlEntity.class, transactionId);
        if (null != transaction) {
            this.sessionFactory.getCurrentSession().delete(transaction);
        }
    }
}
