package com.slimiste.equa_bank.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slimiste.equa_bank.database.dao.ClientAccountDAO;
import com.slimiste.equa_bank.database.entity.ClientAccountEntity;

@Service
public class ClientAccountManagerImpl implements ClientAccountManager {

	@Autowired
	private ClientAccountDAO clientAccountDAO;
	
	@Transactional
	public void add(ClientAccountEntity transaction) {
		this.clientAccountDAO.add(transaction);
	}

	@Transactional
	public List<ClientAccountEntity> getAll() {
		return this.clientAccountDAO.getAll();
	}

	@Transactional
	public void delete(Integer id) {
		this.clientAccountDAO.delete(id);
	}
}
