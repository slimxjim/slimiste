package com.slimiste.equa_bank.service;

import java.util.List;

import com.slimiste.equa_bank.entity.ClientAccountEntity;
import com.slimiste.equa_bank.entity.PartnerAccountEntity;
import com.slimiste.equa_bank.entity.TransactionEntity;

public interface ClientAccountManager 
{
    public void add(ClientAccountEntity entity);
    public List<ClientAccountEntity> getAll();
    public void delete(Integer id);
}