package com.slimiste.equa_bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slimiste.equa_bank.dao.PartnerAccountDAO;
import com.slimiste.equa_bank.entity.PartnerAccountEntity;

@Service
public class PartnerAccountManagerImpl implements PartnerAccountManager {

	@Autowired
	private PartnerAccountDAO partnerAccountDAO;
	
	@Transactional
	public void add(PartnerAccountEntity transaction) {
		this.partnerAccountDAO.add(transaction);
	}

	@Transactional
	public List<PartnerAccountEntity> getAll() {
		return this.partnerAccountDAO.getAll();
	}

	@Transactional
	public void delete(Integer id) {
		this.partnerAccountDAO.delete(id);
	}
}
