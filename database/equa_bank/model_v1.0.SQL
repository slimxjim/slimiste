﻿/*
Created: 10.5.2014
Modified: 10.5.2014
Model: MySQL 5.5
Database: MySQL 5.5
*/

-- Create tables section -------------------------------------------------

-- Table TRANSACTION

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

-- Table PARTNER_ACCOUNT

CREATE TABLE PARTNER_ACCOUNT
(
  TRANSACTION_ID Int NOT NULL,
  ACCOUNT_NUMBER Int,
  ACCOUNT_BANKCODE Int(4),
  ACCOUNT_NAME Text
)
;

ALTER TABLE PARTNER_ACCOUNT ADD PRIMARY KEY (TRANSACTION_ID)
;

-- Table CLIENT_ACCOUNT

CREATE TABLE CLIENT_ACCOUNT
(
  TRANSACTION_ID Int NOT NULL,
  ACCOUNT_NUMBER Int,
  ACCOUNT_BANKCODE Int(4),
  ACCOUNT_IBAN Text
)
;

ALTER TABLE CLIENT_ACCOUNT ADD PRIMARY KEY (TRANSACTION_ID)
;

-- Table TRANSACTION_FROM_HTML

CREATE TABLE TRANSACTION_FROM_HTML
(
  TRANSACTION_ID Int NOT NULL,
  ACCOUNTED_DATE Date,
  AMOUNT Float(2),
  CURRENCY Char(6),
  TRANSACTION_TYPE Text,
  ACCOUNT_NAME Text,
  TRANSACTION_DIRECTION Char(20),
  TARGET_ACCOUNT_NAME Text,
  PERSONAL_DESCRIPTION Text,
  VARIABLE_SYMBOL Int(10)
)
;

ALTER TABLE TRANSACTION_FROM_HTML ADD PRIMARY KEY (TRANSACTION_ID)
;

-- Create relationships section ------------------------------------------------- 

ALTER TABLE TRANSACTION ADD CONSTRAINT TRANSACTIONS__PARTNER_ACCOUNT FOREIGN KEY (ID) REFERENCES PARTNER_ACCOUNT (TRANSACTION_ID) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE TRANSACTION ADD CONSTRAINT TRANSACTIONS__CLIENT_ACCOUNT FOREIGN KEY (ID) REFERENCES CLIENT_ACCOUNT (TRANSACTION_ID) ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE TRANSACTION ADD CONSTRAINT TRANSACTION_HTML_TRANS FOREIGN KEY (ID) REFERENCES TRANSACTION_FROM_HTML (TRANSACTION_ID) ON DELETE NO ACTION ON UPDATE NO ACTION
;


