package com.safasoft.mobsur.rest.client.run;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.web.client.RestTemplate;

import com.safasoft.mobsur.rest.client.bean.OrderTask;
import com.safasoft.mobsur.rest.client.bean.TaskResultImage;
import com.safasoft.mobsur.rest.client.bean.support.UpdateStatusBean;
import com.safasoft.mobsur.rest.client.service.ResultCollectionService;
import com.safasoft.mobsur.rest.client.wrapper.ResultCollectionWrapper;

public class ResultCollectionRun extends BaseRun<ResultCollectionWrapper,ResultCollectionService>{

	public ResultCollectionRun(RestTemplate template, String uri, String userRun, String coyCode) {
		super(template, uri + "/result", userRun, coyCode);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ResultCollectionWrapper getData() {
		ResultCollectionWrapper resultWrapper = new ResultCollectionWrapper();
		//have not been implemented yet
		return resultWrapper;
	}
	
	@Override
	public ResultCollectionWrapper saveData(ResultCollectionWrapper resultWrapper) {
		//order
		resultWrapper.setOrderTaskList(service.saveOrderTask(resultWrapper.getOrderTaskList(), numOfBulkRecord));
		logger.info("order task list size: " + resultWrapper.getOrderTaskList().size());
		
		//result
		resultWrapper.setTaskResultList(service.saveTaskResult(resultWrapper.getTaskResultList(), numOfBulkRecord));
		logger.info("task result list size: " + resultWrapper.getTaskResultList().size());
		
		//result detail
		resultWrapper.setTaskResultDetailList(service.saveTaskResultDetail(resultWrapper.getTaskResultDetailList(), numOfBulkRecord));
		logger.info("task result detail list size: " + resultWrapper.getTaskResultDetailList().size());
		
		//result detail list
		resultWrapper.setTaskResultDetailListList(service.saveTaskResultDetailList(resultWrapper.getTaskResultDetailListList(), numOfBulkRecord));
		logger.info("task result detail list list size: " + resultWrapper.getTaskResultDetailListList().size());
		
		//result image
		List<TaskResultImage> taskResultImageList = resultWrapper.getTaskResultImageList();
		for(TaskResultImage image : taskResultImageList) {
			image.setImage(Base64.decodeBase64(image.getImageStr64()));
			image.setImageStr64(null);
		}
		resultWrapper.setTaskResultImageList(service.saveTaskResultImage(resultWrapper.getTaskResultImageList(), numOfBulkRecord));
		logger.info("task result image list size: " + resultWrapper.getTaskResultImageList().size());
		
		return resultWrapper;
	}
	
	@Override
	public UpdateStatusBean getUpdateStatusBean(ResultCollectionWrapper resultCollWrapper) { 
		UpdateStatusBean updateStatusBean = new UpdateStatusBean();
		List<String> idList = new ArrayList<>();
		List<OrderTask> taskOrderList = resultCollWrapper.getOrderTaskList();
		for(OrderTask order : taskOrderList)
			idList.add(order.getOrderId());
		updateStatusBean.setIdList(idList);
		updateStatusBean.setStatus("PULL");
		return updateStatusBean;
	}
	
	@Override
	public void saveUpdateStatus(UpdateStatusBean updateStatusBean) {
		List<OrderTask> orderTaskList = new ArrayList<>();
		String status = updateStatusBean.getStatus();
		for(String id : updateStatusBean.getIdList()) {
			OrderTask order = service.getByOrderTask(id);
			order.setTaskStatusId(status);
			orderTaskList.add(order);
		}
		service.saveOrderTask(orderTaskList, numOfBulkRecord);
	}

}
