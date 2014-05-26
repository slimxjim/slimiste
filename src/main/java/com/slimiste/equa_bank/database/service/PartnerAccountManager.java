package com.slimiste.equa_bank.database.service;

import java.util.List;

import com.slimiste.equa_bank.database.entity.PartnerAccountEntity;
import com.slimiste.equa_bank.database.entity.TransactionEntity;

public interface PartnerAccountManager 
{
    public void add(PartnerAccountEntity entity);
    public List<PartnerAccountEntity> getAll();
    public void delete(Integer id);
}