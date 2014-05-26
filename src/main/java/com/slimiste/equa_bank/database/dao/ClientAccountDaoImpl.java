package com.slimiste.equa_bank.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.slimiste.equa_bank.entity.ClientAccountEntity;

public class ClientAccountDaoImpl implements ClientAccountDAO {

	@Autowired
    @Qualifier(value="sessionFactoryEquaBank")
    private SessionFactory sessionFactory;
	
	@Override
	public void add(ClientAccountEntity entity) {
		this.sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public List<ClientAccountEntity> getAll() {
		@SuppressWarnings("unchecked")
		List<ClientAccountEntity> list = this.sessionFactory.getCurrentSession().createQuery("from ClientAccountEntity").list();
		return list;
	}

	@Override
	public void delete(Integer id) {
		ClientAccountEntity entity = (ClientAccountEntity) sessionFactory.getCurrentSession().load(
				ClientAccountEntity.class, id);
        if (null != entity) {
            this.sessionFactory.getCurrentSession().delete(entity);
        }
	}
}
