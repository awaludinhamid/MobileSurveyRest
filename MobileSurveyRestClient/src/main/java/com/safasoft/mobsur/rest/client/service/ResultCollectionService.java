package com.safasoft.mobsur.rest.client.service;

import java.util.List;

import com.safasoft.mobsur.rest.client.bean.OrderTask;
import com.safasoft.mobsur.rest.client.bean.TaskResult;
import com.safasoft.mobsur.rest.client.bean.TaskResultDetail;
import com.safasoft.mobsur.rest.client.bean.TaskResultDetailList;
import com.safasoft.mobsur.rest.client.bean.TaskResultImage;

public interface ResultCollectionService {

	List<TaskResult> saveResult(List<TaskResult> taskResults, int bulkRecord);
	List<TaskResultDetail> saveResultDetail(List<TaskResultDetail> taskResultDetails, int bulkRecord);
	List<TaskResultDetailList> saveResultDetailList(List<TaskResultDetailList> taskResultDetailLists, int bulkRecord);
	List<TaskResultImage> saveResultImage(List<TaskResultImage> taskResultImages, int bulkRecord);
	List<OrderTask> saveTask(List<OrderTask> orderTasks, int bulkRecord);
	OrderTask getByOrderTask(String orderId);
	List<OrderTask> saveOrderTask(List<OrderTask> orderTaskList, int bulkRecord);
	List<TaskResult> saveTaskResult(List<TaskResult> taskResultList, int bulkRecord);
	List<TaskResultDetail> saveTaskResultDetail(List<TaskResultDetail> taskResultDetailList, int bulkRecord);
	List<TaskResultDetailList> saveTaskResultDetailList(List<TaskResultDetailList> taskResultDetailListList, int bulkRecord);
	List<TaskResultImage> saveTaskResultImage(List<TaskResultImage> taskResultImageList, int bulkRecord);
	
}
