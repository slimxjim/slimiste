package com.slimiste.equa_bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARTNER_ACCOUNT")
public class PartnerAccountEntity {
	
	/*
	 CREATE TABLE PARTNER_ACCOUNT
		(
		  TRANSACTION_ID Int NOT NULL,
		  ACCOUNT_NUMBER Int,
		  ACCOUNT_BANKCODE Int(4),
		  ACCOUNT_NAME Text
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
	private String accountNumber;
	
	@Column(name="ACCOUNT_BANKCODE")
	private Integer accountBankCode;
	
	@Column(name="ACCOUNT_NAME")
	private String accountName;

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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getAccountBankCode() {
		return accountBankCode;
	}

	public void setAccountBankCode(Integer accountBankCode) {
		this.accountBankCode = accountBankCode;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
}
