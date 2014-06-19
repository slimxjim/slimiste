package com.slimiste.equa_bank.database.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="TRANSACTION")
public class TransactionEntity {
	public static final String ID 						= "ID";
	public static final String VALUE_DATE 				= "VALUE_DATE";
	public static final String POSTING_DATE 			= "POSTING_DATE";
	public static final String AMOUNT 					= "AMOUNT";
	public static final String CURRENCY 				= "CURRENCY";
	public static final String MOVEMENT_TYPE 			= "MOVEMENT_TYPE";
	public static final String PURPOSE_OF_PAYMENT 		= "PURPOSE_OF_PAYMENT";
	public static final String CATEGORY 				= "CATEGORY";
	public static final String BANK_REF 				= "BANK_REF";
	public static final String VARIABLE_SYMBOL 			= "VARIABLE_SYMBOL";
	public static final String PERSONAL_DESCRIPTION		= "PERSONAL_DESCRIPTION";
     /*
      CREATE TABLE TRANSACTION
		(
		  ID Int NOT NULL AUTO_INCREMENT,
		  VALUE_DATE Date NOT NULL,
		  POSTING_DATE Date,
		  AMOUNT Float(2) NOT NULL,
		  CURRENCY Char(6) DEFAULT CZK,
		  MOVEMENT_TYPE Text,
		  PURPOSE_OF_PAYMENT Text,
		  CATEGORY Text,
		  BANK_REF Text,
		  VARIABLE_SYMBOL Int,
		  PERSONAL_DESCRIPTION Text,
		 PRIMARY KEY (ID),
		 UNIQUE ID (ID)
		)
		;
      */
    @Id
    @Column(name=ID)
    @GeneratedValue
    private Integer id;

    @Column(name=VALUE_DATE)
    @Type(type="date")
	private Date valueDate;
    
    @Column(name=POSTING_DATE)
    @Type(type="date")
    private Date postingDate;
    
    @Column(name=AMOUNT)
    private Double amount;
    
    @Column(name=CURRENCY)
    private String currency;
    
    @Column(name=MOVEMENT_TYPE)
    private String movementType;
    
    @Column(name=PURPOSE_OF_PAYMENT)
    private String purposeOfPayment;
    
    @Column(name=CATEGORY)
    private String category;
    
    @Column(name=BANK_REF)
    private String bankRef;
    
    @Column(name=VARIABLE_SYMBOL)
    private Integer variableSymbol;
    
    @Column(name=PERSONAL_DESCRIPTION)
    private String personalDescription;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
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

	public String getMovementType() {
		return movementType;
	}

	public void setMovementType(String movementType) {
		this.movementType = movementType;
	}

	public String getPurposeOfPayment() {
		return purposeOfPayment;
	}

	public void setPurposeOfPayment(String purposeOfPayment) {
		this.purposeOfPayment = purposeOfPayment;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBankRef() {
		return bankRef;
	}

	public void setBankRef(String bankRef) {
		this.bankRef = bankRef;
	}

	public Integer getVariableSymbol() {
		return variableSymbol;
	}

	public void setVariableSymbol(Integer variableSymbol) {
		this.variableSymbol = variableSymbol;
	}

	public String getPersonalDescription() {
		return personalDescription;
	}

	public void setPersonalDescription(String personalDescription) {
		this.personalDescription = personalDescription;
	}
}