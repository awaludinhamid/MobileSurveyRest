package com.safasoft.mobsur.rest.client.run;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.safasoft.mobsur.rest.client.bean.OrderTask;
import com.safasoft.mobsur.rest.client.service.OrderTaskService;
import com.safasoft.mobsur.rest.client.wrapper.OrderTaskWrapper;

public class OrderTaskRun extends BaseRun<OrderTaskWrapper,OrderTaskService> {

	public OrderTaskRun(RestTemplate template, String uri, String userRun, String coyCode) {
		super(template, uri + "/task", userRun, coyCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected OrderTaskWrapper getData() {
		List<OrderTask> orderTaskList = service.getByNullStatus();
		logger.info("Order to post: ");
		for(OrderTask order : orderTaskList) {
			if(order.getCreatedBy() == null)
				order.setCreatedBy(userRun);
			if(order.getUpdatedBy() == null)
				order.setUpdatedBy(userRun);
			logger.info(order.getOrderId());
		}
		return new OrderTaskWrapper(orderTaskList);
	}
	
	@Override
	protected OrderTaskWrapper saveData(OrderTaskWrapper taskWrapper) {
		return new OrderTaskWrapper(service.save(taskWrapper.getOrderTaskList(), numOfBulkRecord));
	}
}
