package com.safasoft.mobsur.rest.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobsur.rest.client.bean.OrderTask;
import com.safasoft.mobsur.rest.client.dao.OrderTaskDAO;
import com.safasoft.mobsur.rest.client.service.OrderTaskService;

@Service("orderTaskService")
@Transactional(readOnly=true)
public class OrderTaskServiceImpl implements OrderTaskService {

	@Autowired
	private OrderTaskDAO orderTaskDAO;

	@Override
	public List<OrderTask> getAll() {
		// TODO Auto-generated method stub
		return orderTaskDAO.getAll();
	}

	@Override
	public List<OrderTask> getByNullStatus() {
		// TODO Auto-generated method stub
		return orderTaskDAO.getByNullStatus();
	}

	@Override
	public List<OrderTask> save(List<OrderTask> orderTaskList, int bulkRecord) {
		// TODO Auto-generated method stub
		return orderTaskDAO.save(orderTaskList, bulkRecord);
	}
}
