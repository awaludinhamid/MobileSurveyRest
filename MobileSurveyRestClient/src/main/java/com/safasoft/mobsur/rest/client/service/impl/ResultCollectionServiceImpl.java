package com.safasoft.mobsur.rest.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobsur.rest.client.bean.OrderTask;
import com.safasoft.mobsur.rest.client.bean.TaskResult;
import com.safasoft.mobsur.rest.client.bean.TaskResultDetail;
import com.safasoft.mobsur.rest.client.bean.TaskResultDetailList;
import com.safasoft.mobsur.rest.client.bean.TaskResultImage;
import com.safasoft.mobsur.rest.client.dao.OrderTaskDAO;
import com.safasoft.mobsur.rest.client.dao.TaskResultDAO;
import com.safasoft.mobsur.rest.client.dao.TaskResultDetailDAO;
import com.safasoft.mobsur.rest.client.dao.TaskResultDetailListDAO;
import com.safasoft.mobsur.rest.client.dao.TaskResultImageDAO;
import com.safasoft.mobsur.rest.client.service.ResultCollectionService;

@Service("resultCollectionService")
@Transactional(readOnly=true)
public class ResultCollectionServiceImpl implements ResultCollectionService {

	@Autowired
	private TaskResultDAO taskResultDAO;
	@Autowired
	private TaskResultDetailDAO taskResultDetailDAO;
	@Autowired
	private TaskResultDetailListDAO taskResultDetailListDAO;
	@Autowired
	private TaskResultImageDAO taskResultImageDAO;
	@Autowired
	private OrderTaskDAO orderTaskDAO;

	@Override
	@Transactional(readOnly=false)
	public List<TaskResult> saveResult(List<TaskResult> taskResults, int bulkRecord) {
		// TODO Auto-generated method stub
		return taskResultDAO.save(taskResults, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false)
	public List<TaskResultDetail> saveResultDetail(List<TaskResultDetail> taskResultDetails, int bulkRecord) {
		// TODO Auto-generated method stub
		return taskResultDetailDAO.save(taskResultDetails, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false)
	public List<TaskResultDetailList> saveResultDetailList(List<TaskResultDetailList> taskResultDetailLists,
			int bulkRecord) {
		// TODO Auto-generated method stub
		return taskResultDetailListDAO.save(taskResultDetailLists, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false)
	public List<TaskResultImage> saveResultImage(List<TaskResultImage> taskResultImages, int bulkRecord) {
		// TODO Auto-generated method stub
		return taskResultImageDAO.save(taskResultImages, bulkRecord);
	}

	@Override
	public List<OrderTask> saveTask(List<OrderTask> orderTasks, int bulkRecord) {
		// TODO Auto-generated method stub
		return orderTaskDAO.save(orderTasks, bulkRecord);
	}

	@Override
	public OrderTask getByOrderTask(String orderId) {
		// TODO Auto-generated method stub
		return orderTaskDAO.getById(orderId);
	}

	@Override
	@Transactional(readOnly=false)
	public List<OrderTask> saveOrderTask(List<OrderTask> orderTaskList, int bulkRecord) {
		// TODO Auto-generated method stub
		return orderTaskDAO.save(orderTaskList, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false)
	public List<TaskResult> saveTaskResult(List<TaskResult> taskResultList, int bulkRecord) {
		// TODO Auto-generated method stub
		return taskResultDAO.save(taskResultList, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false)
	public List<TaskResultDetail> saveTaskResultDetail(List<TaskResultDetail> taskResultDetailList, int bulkRecord) {
		// TODO Auto-generated method stub
		return taskResultDetailDAO.save(taskResultDetailList, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false)
	public List<TaskResultDetailList> saveTaskResultDetailList(List<TaskResultDetailList> taskResultDetailListList,
			int bulkRecord) {
		// TODO Auto-generated method stub
		return taskResultDetailListDAO.save(taskResultDetailListList, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false)
	public List<TaskResultImage> saveTaskResultImage(List<TaskResultImage> taskResultImageList, int bulkRecord) {
		// TODO Auto-generated method stub
		return taskResultImageDAO.save(taskResultImageList, bulkRecord);
	} 
}
