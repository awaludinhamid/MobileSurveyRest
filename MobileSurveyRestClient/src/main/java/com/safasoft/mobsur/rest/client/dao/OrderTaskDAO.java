package com.safasoft.mobsur.rest.client.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.safasoft.mobsur.rest.client.bean.OrderTask;

@Repository("orderTaskDAO")
public class OrderTaskDAO extends BaseDAO<OrderTask> {

	@SuppressWarnings("unchecked")
	public List<OrderTask> getByNullStatus() {
		return sessionFactory.getCurrentSession().createQuery(
					"from " + domainClass.getName() + " task " +
							"where taskStatusId is null")
				.list();
	}
}
