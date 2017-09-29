package com.safasoft.mobsur.rest.client.service;

import java.util.List;

import com.safasoft.mobsur.rest.client.bean.OrderTask;

public interface OrderTaskService {

	List<OrderTask> getAll();
	List<OrderTask> getByNullStatus();
	List<OrderTask> save(List<OrderTask> orderTaskList, int bulkRecord);
}
