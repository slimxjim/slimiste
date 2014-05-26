package com.slimiste.equa_bank.database.service;

import java.util.List;

import com.slimiste.equa_bank.database.entity.ClientAccountEntity;
import com.slimiste.equa_bank.database.entity.PartnerAccountEntity;
import com.slimiste.equa_bank.database.entity.TransactionEntity;

public interface ClientAccountManager 
{
    public void add(ClientAccountEntity entity);
    public List<ClientAccountEntity> getAll();
    public void delete(Integer id);
}