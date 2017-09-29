package com.safasoft.mobilesurvey.rest.controller.resource;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safasoft.mobilesurvey.rest.bean.MasterTaskStatus;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskAssignment;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskResult;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetail;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetailList;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultImage;
import com.safasoft.mobilesurvey.rest.client.bean.OrderTask;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResult;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetail;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetailList;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultImage;
import com.safasoft.mobilesurvey.rest.client.bean.support.UpdateStatusBean;
import com.safasoft.mobilesurvey.rest.client.wrapper.ResultCollectionWrapper;
import com.safasoft.mobilesurvey.rest.service.MasterOfficeService;
import com.safasoft.mobilesurvey.rest.service.MasterProductService;
import com.safasoft.mobilesurvey.rest.service.MasterQuestionService;
import com.safasoft.mobilesurvey.rest.service.MasterTaskStatusService;
import com.safasoft.mobilesurvey.rest.service.MasterUserService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskAssignmentService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultDetailListService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultDetailService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultImageService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultService;

/**
 * Container of result collection which extends base resource
 * @author awal
 */
@RestController
@RequestMapping("/client/result")
public class ResultResource extends BaseResource<ResultCollectionWrapper> {
	
	//Service injection list
	@Autowired
	private MobileTaskResultService mtrServ;
	@Autowired
	private MobileTaskResultDetailService mtrdServ;
	@Autowired
	private MobileTaskResultDetailListService mtrdlServ;
	@Autowired
	private MobileTaskResultImageService mtriServ;
	@Autowired
	private MobileTaskAssignmentService mtaServ;
	@Autowired
	private MasterOfficeService moServ;
	@Autowired
	private MasterProductService mpServ;
	@Autowired
	private MasterTaskStatusService mtsServ;
	@Autowired
	private MasterUserService muServ;
	@Autowired
	private MasterQuestionService mqServ;

	/**
	 * Get data from database
	 * These contains collection of task, result, result detail, result detail list and result image
	 * Specific to image, remember to convert it to string base64 
	 * @param coyCode, company
	 * @return container contains all list of result collection 
	 */
	@Override
	public ResultCollectionWrapper getData(String coyCode) {
		
		//
		String taskStatusCode = "VERIF";
		ResultCollectionWrapper resultCollWrapper = new ResultCollectionWrapper();		
		//
		resultCollWrapper.setTaskResultList(mtrServ.getByCoyAndStatusResult(coyCode, taskStatusCode));
		//
		resultCollWrapper.setTaskResultDetailList(mtrdServ.getByCoyAndStatusResult(coyCode, taskStatusCode));
		//
		resultCollWrapper.setTaskResultDetailListList(mtrdlServ.getByCoyAndStatusResult(coyCode, taskStatusCode));
		//
		List<TaskResultImage> taskResultImageList = mtriServ.getByCoyAndStatusResult(coyCode, taskStatusCode);	
		for(TaskResultImage image : taskResultImageList) {
			image.setImageStr64(Base64.encodeBase64String(image.getImage()));
			image.setImage(null);
		}
		resultCollWrapper.setTaskResultImageList(taskResultImageList);
		//
		List<OrderTask> orderTaskList = mtaServ.getByCoyAndStatusOrder(coyCode, taskStatusCode);	
		resultCollWrapper.setOrderTaskList(orderTaskList);
		logger.info("Order request: ");
		for(OrderTask order : orderTaskList)
			logger.info(order.getOrderId());
		//
		return resultCollWrapper;
	}
	
	/**
	 * Save given data to database
	 * Process are: update task, insert result, result detail, result detail list and result image
	 * @param resultCollWrapper, wrapper contain collection of result, result detail, result detail list and result image
	 * @param numOfBulkRecord, number of record per update/insert batch
	 * @param userRun, user who execute this process
	 * @return collection contains all list of saved results collections
	 */
	@Override
	public ResultCollectionWrapper saveData(ResultCollectionWrapper resultCollWrapper, int numOfBulkRecord, String userRun) {
		try {
			//order task
			List<MobileTaskAssignment> taskList = new ArrayList<>();
			for(OrderTask order : resultCollWrapper.getOrderTaskList()) {
				MobileTaskAssignment task = new MobileTaskAssignment();
				BeanUtils.copyProperties(task, order);
				if(order.getOfficeId() != null)
					task.setOffice(moServ.getById(new Integer(order.getOfficeId())));
				if(order.getProductId() != null)
					task.setProduct(mpServ.getById(new Integer(order.getProductId())));
				if(order.getTaskStatusId() != null)
					task.setTaskStatus(mtsServ.getById(new Integer(order.getTaskStatusId())));
				task.setUpdatedBy(userRun);
				if(order.getUserId() != null)
					task.setUser(muServ.getById(new Integer(order.getUserId())));
				taskList.add(task);
			}
			List<OrderTask> orderTaskList = new ArrayList<>();
			for(MobileTaskAssignment task : mtaServ.save(taskList, numOfBulkRecord)) {
				OrderTask orderTask = new OrderTask();
				BeanUtils.copyProperties(orderTask, task);
				if(task.getOffice() != null)
					orderTask.setOfficeId(task.getOffice().getOfficeId() + "");
				if(task.getProduct() != null)
					orderTask.setProductId(task.getProduct().getProductId() + "");
				if(task.getTaskStatus() != null)
					orderTask.setTaskStatusId(task.getTaskStatus().getTaskStatusId() + "");
				if(task.getUser() != null)
					orderTask.setUserId(task.getUser().getUserId() + "");
				orderTaskList.add(orderTask);			
			}
			resultCollWrapper.setOrderTaskList(orderTaskList);
			
			//task result
			List<MobileTaskResult> taskResultList = new ArrayList<>();
			for(TaskResult result : resultCollWrapper.getTaskResultList()) {
				MobileTaskResult taskResult = new MobileTaskResult();
				BeanUtils.copyProperties(taskResult, result);
				taskResult.setTask(mtaServ.getById(result.getTaskId()));
				taskResultList.add(taskResult);
			}
			List<TaskResult> resultList = new ArrayList<>();
			for(MobileTaskResult taskResult : mtrServ.save(taskResultList, numOfBulkRecord)) {
				TaskResult result = new TaskResult();
				BeanUtils.copyProperties(result, taskResult);
				result.setTaskId(taskResult.getTask().getTaskId());
				resultList.add(result);			
			}
			resultCollWrapper.setTaskResultList(resultList);
			
			//task result detail
			List<MobileTaskResultDetail> taskResultDetailList = new ArrayList<>();
			for(TaskResultDetail resultDetail : resultCollWrapper.getTaskResultDetailList()) {
				MobileTaskResultDetail taskResultDetail = new MobileTaskResultDetail();
				BeanUtils.copyProperties(taskResultDetail, resultDetail);
				taskResultDetail.setTaskResult(mtrServ.getById(resultDetail.getTaskResultId()));
				taskResultDetail.setQuestion(mqServ.getById(resultDetail.getQuestId()));
				taskResultDetailList.add(taskResultDetail);
			}
			List<TaskResultDetail> resultDetailList = new ArrayList<>();
			for(MobileTaskResultDetail taskResultDetail : mtrdServ.save(taskResultDetailList, numOfBulkRecord)) {
				TaskResultDetail resultDetail = new TaskResultDetail();
				BeanUtils.copyProperties(resultDetail, taskResultDetail);
				resultDetail.setTaskResultId(taskResultDetail.getTaskResult().getTaskResultId());
				resultDetail.setQuestId(taskResultDetail.getQuestion().getQuestId());
				resultDetailList.add(resultDetail);			
			}
			resultCollWrapper.setTaskResultDetailList(resultDetailList);
			
			//task result detail list
			List<MobileTaskResultDetailList> taskResultDetailListList = new ArrayList<>();
			for(TaskResultDetailList resultDetailLst : resultCollWrapper.getTaskResultDetailListList()) {
				MobileTaskResultDetailList taskResultDetailLst = new MobileTaskResultDetailList();
				BeanUtils.copyProperties(taskResultDetailLst, resultDetailList);
				taskResultDetailLst.setTaskResultDetail(mtrdServ.getById(resultDetailLst.getTaskResultDetId()));
				if(resultDetailLst.getImageId() != null)
					taskResultDetailLst.setTaskResultImage(mtriServ.getById(resultDetailLst.getImageId()));
				taskResultDetailListList.add(taskResultDetailLst);
			}
			List<TaskResultDetailList> resultDetailListList = new ArrayList<>();
			for(MobileTaskResultDetailList taskResultDetailLst : mtrdlServ.save(taskResultDetailListList, numOfBulkRecord)) {
				TaskResultDetailList resultDetailLst = new TaskResultDetailList();
				BeanUtils.copyProperties(resultDetailLst, taskResultDetailLst);
				resultDetailLst.setTaskResultDetId(taskResultDetailLst.getTaskResultDetail().getTaskResultDetId());
				if(taskResultDetailLst.getTaskResultImage() != null)
				resultDetailLst.setImageId(taskResultDetailLst.getTaskResultImage().getImageId());
				resultDetailListList.add(resultDetailLst);			
			}
			resultCollWrapper.setTaskResultDetailListList(resultDetailListList);
			
			//task result image
			List<MobileTaskResultImage> taskResultImageList = new ArrayList<>();
			for(TaskResultImage resultImage : resultCollWrapper.getTaskResultImageList()) {
				MobileTaskResultImage taskResultImage = new MobileTaskResultImage();
				BeanUtils.copyProperties(taskResultImage, resultImage);
				taskResultImageList.add(taskResultImage);
			}
			List<TaskResultImage> resultImageList = new ArrayList<>();
			for(MobileTaskResultImage taskResultImage : mtriServ.save(taskResultImageList, numOfBulkRecord)) {
				TaskResultImage resultImage = new TaskResultImage();
				BeanUtils.copyProperties(resultImage, taskResultImage);
				resultImageList.add(resultImage);			
			}
			resultCollWrapper.setTaskResultImageList(resultImageList);
		} catch (InvocationTargetException | IllegalAccessException e) {
			logger.error(e);
		}
		return resultCollWrapper;
	}
	
	/**
	 * Update task status to database
	 * If no status prepared then set it to new
	 * @param updateStatusBean, task status
	 * @param numOfBulkRecord, number of record per update/insert batch
	 * @param userRun, user who execute this process
	 */
	@Override
	public UpdateStatusBean updateStatus(UpdateStatusBean updateStatusBean, int numOfBulkRecord, String userRun) {
		//
		MasterTaskStatus taskStatus;
		if(updateStatusBean.getStatus() != null)
			taskStatus = mtsServ.getByCode(updateStatusBean.getStatus());
		else
			taskStatus = mtsServ.getByCode("NEW");
		//
		List<MobileTaskAssignment> taskList = new ArrayList<>();
		for(String id : updateStatusBean.getIdList()) {
			logger.info("updated order id: " + id);
			MobileTaskAssignment task = mtaServ.getByOrder(id);
			task.setTaskStatus(taskStatus);
			task.setUpdatedBy(userRun);
			taskList.add(task);
		}
		List<String> idList = new ArrayList<>();
		for(MobileTaskAssignment task : mtaServ.save(taskList, numOfBulkRecord))
			idList.add(task.getOrderId());
		updateStatusBean.setStatus(taskStatus.getTaskStatusId() + "");
		updateStatusBean.setIdList(idList);
		return updateStatusBean;
	}
}
