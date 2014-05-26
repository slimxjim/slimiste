package com.slimiste.equa_bank.database.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="TRANSACTION_FROM_HTML")
public class TransactionFromHtmlEntity {
     /*
        CREATE TABLE TRANSACTION_FROM_HTML
        (
          ID Int NOT NULL AUTO_INCREMENT,
          TRANSACTION_ID Int NOT NULL,
          ACCOUNTED_DATE Date,
          AMOUNT Float(2),
          CURRENCY Char(6),
          TRANSACTION_TYPE Text,
          ACCOUNT_NAME Text,
          TRANSACTION_DIRECTION Char(20),
          TARGET_ACCOUNT_NAME Text,
          PERSONAL_DESCRIPTION Text,
          VARIABLE_SYMBOL Int(10),
         PRIMARY KEY (ID,TRANSACTION_ID),
         UNIQUE ID (ID)
        )
        ;
      */
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;

    @Column(name="TRANSACTION_ID")
    private Integer transactionId;

    @Column(name="ACCOUNTED_DATE")
    @Type(type="date")
    private Date accountdDate;

    @Column(name="AMOUNT")
    private Double amount;

    @Column(name="CURRENCY")
    private String currency;

    @Column(name="TRANSACTION_TYPE")
    private String transactionType;

    @Column(name="ACCOUNT_NAME")
    private String accountName;

    @Column(name="TRANSACTION_DIRECTION")
    private String transactionDirection;

    @Column(name="TARGET_ACCOUNT_NAME")
    private String targetAccountName;

    @Column(name="PERSONAL_DESCRIPTION")
    private String personalDescription;

    @Column(name="VARIABLE_SYMBOL")
    private Integer variableSymbol;

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

    public Date getAccountdDate() {
        return accountdDate;
    }

    public void setAccountdDate(Date accountdDate) {
        this.accountdDate = accountdDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTransactionDirection() {
        return transactionDirection;
    }

    public void setTransactionDirection(String transactionDirection) {
        this.transactionDirection = transactionDirection;
    }

    public String getTargetAccountName() {
        return targetAccountName;
    }

    public void setTargetAccountName(String targetAccountName) {
        this.targetAccountName = targetAccountName;
    }

    public String getPersonalDescription() {
        return personalDescription;
    }

    public void setPersonalDescription(String personalDescription) {
        this.personalDescription = personalDescription;
    }

    public Integer getVariableSymbol() {
        return variableSymbol;
    }

    public void setVariableSymbol(Integer variableSymbol) {
        this.variableSymbol = variableSymbol;
    }
}