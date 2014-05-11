package com.slimiste.equa_bank.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.slimiste.equa_bank.entity.PartnerAccountEntity;

public class PartnerAccountDaoImpl implements PartnerAccountDAO {

	@Autowired
    @Qualifier(value="sessionFactoryEquaBank")
    private SessionFactory sessionFactory;
	
	@Override
	public void add(PartnerAccountEntity entity) {
		this.sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public List<PartnerAccountEntity> getAll() {
		@SuppressWarnings("unchecked")
		List<PartnerAccountEntity> list = this.sessionFactory.getCurrentSession().createQuery("from PartnerAccountEntity").list();
		return list;
	}

	@Override
	public void delete(Integer id) {
		PartnerAccountEntity entity = (PartnerAccountEntity) sessionFactory.getCurrentSession().load(
				PartnerAccountEntity.class, id);
        if (null != entity) {
            this.sessionFactory.getCurrentSession().delete(entity);
        }
	}
}
