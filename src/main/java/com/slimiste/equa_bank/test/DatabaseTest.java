package com.slimiste.equa_bank.test;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.howtodoinjava.service.EmployeeManager;
import com.slimiste.equa_bank.database.entity.ClientAccountEntity;
import com.slimiste.equa_bank.database.entity.PartnerAccountEntity;
import com.slimiste.equa_bank.database.entity.TransactionEntity;
import com.slimiste.equa_bank.database.entity.TransactionFromHtmlEntity;
import com.slimiste.equa_bank.database.service.ClientAccountManager;
import com.slimiste.equa_bank.database.service.PartnerAccountManager;
import com.slimiste.equa_bank.database.service.TransactionFromHtmlManager;
import com.slimiste.equa_bank.database.service.TransactionManagerEB;

@Component
public class DatabaseTest {
    @Autowired
    public EmployeeManager employeeManager;
    @Autowired
    public TransactionManagerEB transactionManagerEB;
    @Autowired
    public PartnerAccountManager partnerAccountManager;
    @Autowired
    public ClientAccountManager clientAccountManager;
    @Autowired
    public TransactionFromHtmlManager transactionFromHtmlManager;


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring/employee-servlet.xml");

        DatabaseTest test = context.getBean(DatabaseTest.class);
        test.test();
    }

    public void test(){
        TransactionEntity transaction = new TransactionEntity();

        transaction.setAmount(56.8);
        transaction.setBankRef("34434FFS");
        transaction.setCategory("Zivobyti");
        transaction.setCurrency("CZK");
        transaction.setMovementType("Platba kartou");
        transaction.setPersonalDescription("muj popis");
        transaction.setPostingDate(Calendar.getInstance().getTime());
        transaction.setPurposeOfPayment("zprava pro prijemce");
        transaction.setValueDate(Calendar.getInstance().getTime());
        transaction.setVariableSymbol(1234567890);
        this.transactionManagerEB.addTransaction(transaction);

        Integer transactionId = transaction.getId();

        PartnerAccountEntity partnerAccountEntity = new PartnerAccountEntity();
        partnerAccountEntity.setTransactionId(transactionId);
        partnerAccountEntity.setAccountBankCode(324);
        partnerAccountEntity.setAccountName("Ja");
        partnerAccountEntity.setAccountBankCode(3300);
        partnerAccountEntity.setAccountNumber("4654664599");
        this.partnerAccountManager.add(partnerAccountEntity);

        ClientAccountEntity clientAccountEntity = new ClientAccountEntity();
        clientAccountEntity.setTransactionId(transactionId);
        clientAccountEntity.setAccountBankCode(324);
        clientAccountEntity.setAccountBankCode(3300);
        clientAccountEntity.setAccountIban("IBANCZ3987970987");
        this.clientAccountManager.add(clientAccountEntity);


        TransactionFromHtmlEntity transactionFromHtmlEntity = new TransactionFromHtmlEntity();
        transactionFromHtmlEntity.setTransactionId(transactionId);
        transactionFromHtmlEntity.setAccountdDate(Calendar.getInstance().getTime());
        transactionFromHtmlEntity.setAccountName("Ja");
        transactionFromHtmlEntity.setAmount(56.8);
        transactionFromHtmlEntity.setCurrency("CZK");
        transactionFromHtmlEntity.setPersonalDescription("muj popis");
        transactionFromHtmlEntity.setTargetAccountName("Druha banka");
        transactionFromHtmlEntity.setTransactionDirection("<-");
        transactionFromHtmlEntity.setTransactionType("Platba kartou SPORT-Výbava");
        transactionFromHtmlEntity.setVariableSymbol(12345);
        this.transactionFromHtmlManager.addTransaction(transactionFromHtmlEntity);

        this.transactionManagerEB.deleteTransaction(transactionId);
        this.partnerAccountManager.delete(partnerAccountEntity.getId());
        this.clientAccountManager.delete(clientAccountEntity.getId());
        this.transactionFromHtmlManager.deleteTransaction(transactionFromHtmlEntity.getId());
    }
}
