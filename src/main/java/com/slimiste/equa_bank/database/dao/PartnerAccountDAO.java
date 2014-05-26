package com.slimiste.equa_bank.database.dao;

import java.util.List;

import com.slimiste.equa_bank.database.entity.PartnerAccountEntity;

public interface PartnerAccountDAO 
{
    public void add(PartnerAccountEntity partnerAccount);
    public List<PartnerAccountEntity> getAll();
    public void delete(Integer id);
}