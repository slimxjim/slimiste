 package com.howtodoinjava.test;  
  
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.dao.EmployeeDAO;
import com.howtodoinjava.entity.EmployeeEntity;
  
  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring/employee-servlet.xml")  
@TransactionConfiguration(defaultRollback=true,transactionManager="transactionManager")  
@Transactional
public class DatabaseConnectionTest {  
  
 @Autowired  
 private EmployeeDAO employeeDAO;  
   
 @Test  
 public void testGetEmployeeById() {  
  List<EmployeeEntity> emp = employeeDAO.getAllEmployees();  
    
  assertNotNull(emp);  
 }  
   
}  