package com.safasoft.mobilesurvey.rest.client.wrapper;

import java.util.List;

import com.safasoft.mobilesurvey.rest.client.bean.OrderTask;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResult;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetail;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetailList;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultImage;

/**
 * Class for container of result collection
 * @created Oct 14, 2016
 * @author awal
 */
public class ResultCollectionWrapper {

	private List<TaskResult> taskResultList;
	private List<TaskResultDetail> taskResultDetailList;
	private List<TaskResultDetailList> taskResultDetailListList;
	private List<TaskResultImage> taskResultImageList;
	private List<OrderTask> orderTaskList;
	
	public List<TaskResult> getTaskResultList() {
		return taskResultList;
	}
	public void setTaskResultList(List<TaskResult> taskResultList) {
		this.taskResultList = taskResultList;
	}
	public List<TaskResultDetail> getTaskResultDetailList() {
		return taskResultDetailList;
	}
	public void setTaskResultDetailList(List<TaskResultDetail> taskResultDetailList) {
		this.taskResultDetailList = taskResultDetailList;
	}
	public List<TaskResultDetailList> getTaskResultDetailListList() {
		return taskResultDetailListList;
	}
	public void setTaskResultDetailListList(List<TaskResultDetailList> taskResultDetailListList) {
		this.taskResultDetailListList = taskResultDetailListList;
	}
	public List<TaskResultImage> getTaskResultImageList() {
		return taskResultImageList;
	}
	public void setTaskResultImageList(List<TaskResultImage> taskResultImageList) {
		this.taskResultImageList = taskResultImageList;
	}
	public List<OrderTask> getOrderTaskList() {
		return orderTaskList;
	}
	public void setOrderTaskList(List<OrderTask> orderTaskList) {
		this.orderTaskList = orderTaskList;
	}

}
