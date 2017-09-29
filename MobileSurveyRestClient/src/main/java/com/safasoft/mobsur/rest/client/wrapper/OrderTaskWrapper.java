package com.safasoft.mobsur.rest.client.wrapper;

import java.util.List;

import com.safasoft.mobsur.rest.client.bean.OrderTask;

public class OrderTaskWrapper {

	private List<OrderTask> orderTaskList;
	
	public OrderTaskWrapper() {}
	public OrderTaskWrapper(List<OrderTask> orderTaskList) {
		this.orderTaskList = orderTaskList;
	}

	public List<OrderTask> getOrderTaskList() {
		return orderTaskList;
	}

	public void setOrderTaskList(List<OrderTask> orderTaskList) {
		this.orderTaskList = orderTaskList;
	}

}
