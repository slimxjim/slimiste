package com.slimiste.equa_bank.test;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.howtodoinjava.service.EmployeeManager;
import com.slimiste.equa_bank.entity.ClientAccountEntity;
import com.slimiste.equa_bank.entity.PartnerAccountEntity;
import com.slimiste.equa_bank.entity.TransactionEntity;
import com.slimiste.equa_bank.service.ClientAccountManager;
import com.slimiste.equa_bank.service.PartnerAccountManager;
import com.slimiste.equa_bank.service.TransactionManagerEB;

@Component
public class TransactionManagerTest {
	@Autowired
	public EmployeeManager employeeManager;
	@Autowired
	public TransactionManagerEB transactionManagerEB;
	@Autowired
	public PartnerAccountManager partnerAccountManager;
	@Autowired
	public ClientAccountManager clientAccountManager;
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/employee-servlet.xml");

		TransactionManagerTest test = context.getBean(TransactionManagerTest.class);
		test.test();
	}
	
	public void test(){
		TransactionEntity transaction = new TransactionEntity();
		
		transaction.setAmount(56.8);
		transaction.setBankRef("34434FFS");
		transaction.setCategory("Živobytí");
		transaction.setCurrency("CZK");
		transaction.setMovementType("Platba kartou");
		transaction.setPersonalDescription("muj popis");
		transaction.setPostingDate(Calendar.getInstance().getTime());
		transaction.setPurposeOfPayment("zpráva pro příjemce");
		transaction.setValueDate(Calendar.getInstance().getTime());
		transaction.setVariableSymbol(1234567890);
		this.transactionManagerEB.addTransaction(transaction);
		
		Integer transactionId = transaction.getId();
		
		PartnerAccountEntity partnerAccountEntity = new PartnerAccountEntity();
		partnerAccountEntity.setTransactionId(transactionId);
		partnerAccountEntity.setAccountBankCode(324);
		partnerAccountEntity.setAccountName("Já");
		partnerAccountEntity.setAccountBankCode(3300);
		partnerAccountEntity.setAccountNumber("4654664599");
		this.partnerAccountManager.add(partnerAccountEntity);
		
		ClientAccountEntity clientAccountEntity = new ClientAccountEntity();
		clientAccountEntity.setTransactionId(transactionId);
		clientAccountEntity.setAccountBankCode(324);
		clientAccountEntity.setAccountBankCode(3300);
		clientAccountEntity.setAccountIban("IBANCZ3987970987");
		this.clientAccountManager.add(clientAccountEntity);
		
		this.transactionManagerEB.deleteTransaction(transactionId);
		this.partnerAccountManager.delete(transactionId);
		this.clientAccountManager.delete(transactionId);
	}
}
