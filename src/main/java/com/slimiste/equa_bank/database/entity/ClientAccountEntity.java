package com.slimiste.equa_bank.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENT_ACCOUNT")
public class ClientAccountEntity {

    /*
     CREATE TABLE CLIENT_ACCOUNT
        (
          TRANSACTION_ID Int NOT NULL,
          ACCOUNT_NUMBER Int,
          ACCOUNT_BANKCODE Int(4),
          ACCOUNT_IBAN Text
        )
        ;
     */
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;

    @Column(name="TRANSACTION_ID")
    private Integer transactionId;

    @Column(name="ACCOUNT_NUMBER")
    private Integer accountNumber;

    @Column(name="ACCOUNT_BANKCODE")
    private Integer accountBankCode;

    @Column(name="ACCOUNT_IBAN")
    private String accountIban;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAccountBankCode() {
        return accountBankCode;
    }

    public void setAccountBankCode(Integer accountBankCode) {
        this.accountBankCode = accountBankCode;
    }

    public String getAccountIban() {
        return accountIban;
    }

    public void setAccountIban(String accountIban) {
        this.accountIban = accountIban;
    }
}
