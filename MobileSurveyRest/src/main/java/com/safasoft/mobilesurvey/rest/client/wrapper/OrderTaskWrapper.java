package com.safasoft.mobilesurvey.rest.client.wrapper;

import java.util.List;

import com.safasoft.mobilesurvey.rest.client.bean.OrderTask;

/**
 * Class for container of Order Task list
 * @created Oct 14, 2016
 * @author awal
 */
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
