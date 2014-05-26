package com.slimiste.equa_bank.database.dao;

import java.util.List;

import com.slimiste.equa_bank.database.entity.ClientAccountEntity;

public interface ClientAccountDAO 
{
    public void add(ClientAccountEntity partnerAccount);
    public List<ClientAccountEntity> getAll();
    public void delete(Integer id);
}