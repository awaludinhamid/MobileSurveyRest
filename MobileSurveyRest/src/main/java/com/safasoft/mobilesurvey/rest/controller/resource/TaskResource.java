package com.safasoft.mobilesurvey.rest.controller.resource;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskAssignment;
import com.safasoft.mobilesurvey.rest.client.bean.OrderTask;
import com.safasoft.mobilesurvey.rest.client.wrapper.OrderTaskWrapper;
import com.safasoft.mobilesurvey.rest.service.MasterOfficeService;
import com.safasoft.mobilesurvey.rest.service.MasterProductService;
import com.safasoft.mobilesurvey.rest.service.MasterTaskStatusService;
import com.safasoft.mobilesurvey.rest.service.MasterUserService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskAssignmentService;

/**
 * Container of order task which extends base resource
 * @author awal
 */
@RestController
@RequestMapping("/client/task")
public class TaskResource extends BaseResource<OrderTaskWrapper> {
	
	//Service injection list
	@Autowired
	private MasterOfficeService moServ;
	@Autowired
	private MasterProductService mpServ;
	@Autowired
	private MasterTaskStatusService mtsServ;
	@Autowired
	private MasterUserService muServ;
	@Autowired
	private MobileTaskAssignmentService mtaServ;

	/**
	 * Get data from database
	 * These contains list of order task
	 * @param coyCode
	 * @return container contains the list
	 */
	@Override
	public OrderTaskWrapper getData(String coyCode) {		
		return new OrderTaskWrapper(mtaServ.getByCoyAndStatusOrder(coyCode, "SUBM"));
	}

	/**
	 * Save given data to database
	 * @param taskWrapper, wrapper contain list of order task
	 * @param numOfBulkRecord, number of record per update/insert batch
	 * @param userRun, user who execute this process
	 * @return collection contains list of saved order task
	 */
	@Override
	public OrderTaskWrapper saveData(OrderTaskWrapper taskWrapper, int numOfBulkRecord, String userRun) {
		try {
			List<MobileTaskAssignment> taskList = new ArrayList<>();
			for(OrderTask order : taskWrapper.getOrderTaskList()) {
				MobileTaskAssignment task = new MobileTaskAssignment();
				BeanUtils.copyProperties(task, order);
				if(order.getOfficeId() != null)
					task.setOffice(moServ.getById(new Integer(order.getOfficeId())));
				if(order.getProductId() != null)
					task.setProduct(mpServ.getById(new Integer(order.getProductId())));
				task.setReceiveDate(today);
				if(order.getTaskStatusId() == null) {
					task.setCreatedBy(userRun);
					task.setTaskStatus(mtsServ.getByCode("NEW"));
				}
				task.setUpdatedBy(userRun);
				if(order.getUserId() != null)
					task.setUser(muServ.getById(new Integer(order.getUserId())));
				taskList.add(task);
			}
			//
			List<OrderTask> orderTaskList = new ArrayList<>();
			for(MobileTaskAssignment task : mtaServ.save(taskList, numOfBulkRecord)) {
				OrderTask order = new OrderTask();
				BeanUtils.copyProperties(order, task);
				if(task.getOffice() != null)
					order.setOfficeId(task.getOffice().getOfficeId() + "");
				if(task.getProduct() != null)
					order.setProductId(task.getProduct().getProductId() + "");
				if(task.getTaskStatus() != null)
					order.setTaskStatusId(task.getTaskStatus().getTaskStatusId() + "");
				if(task.getUser() != null)
					order.setUserId(task.getUser().getUserId() + "");
				orderTaskList.add(order);			
			}
			taskWrapper.setOrderTaskList(orderTaskList);
		} catch(InvocationTargetException | IllegalAccessException e) {
			logger.error(e);
		}
		return taskWrapper;
	}
}
