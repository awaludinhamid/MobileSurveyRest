package com.safasoft.mobilesurvey.rest.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.safasoft.mobilesurvey.rest.bean.MasterCompany;
import com.safasoft.mobilesurvey.rest.bean.MasterDistribution;
import com.safasoft.mobilesurvey.rest.bean.MasterOffice;
import com.safasoft.mobilesurvey.rest.bean.MasterProduct;
import com.safasoft.mobilesurvey.rest.bean.MasterUser;
import com.safasoft.mobilesurvey.rest.bean.MasterZipcodeVerificator;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskAssignment;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskResult;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetail;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetailList;
import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultImage;
import com.safasoft.mobilesurvey.rest.bean.support.RestResponseBean;
import com.safasoft.mobilesurvey.rest.bean.support.StringBean;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskAssignmentDTO;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskAssignmentPostDTO;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDTO;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDetailDTO;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDetailListDTO;
import com.safasoft.mobilesurvey.rest.service.DetailQuestionGroupService;
import com.safasoft.mobilesurvey.rest.service.DetailTemplateService;
import com.safasoft.mobilesurvey.rest.service.GenericService;
import com.safasoft.mobilesurvey.rest.service.MasterAbsenceService;
import com.safasoft.mobilesurvey.rest.service.MasterCompanyService;
import com.safasoft.mobilesurvey.rest.service.MasterDistributionService;
import com.safasoft.mobilesurvey.rest.service.MasterGroupParamService;
import com.safasoft.mobilesurvey.rest.service.MasterOfficeService;
import com.safasoft.mobilesurvey.rest.service.MasterParameterService;
import com.safasoft.mobilesurvey.rest.service.MasterParentParameterService;
import com.safasoft.mobilesurvey.rest.service.MasterProductService;
import com.safasoft.mobilesurvey.rest.service.MasterQuestionGroupService;
import com.safasoft.mobilesurvey.rest.service.MasterQuestionService;
import com.safasoft.mobilesurvey.rest.service.MasterTaskStatusService;
import com.safasoft.mobilesurvey.rest.service.MasterTemplateService;
import com.safasoft.mobilesurvey.rest.service.MasterUserService;
import com.safasoft.mobilesurvey.rest.service.MasterZipcodeVerificatorService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskAssignmentService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultDetailListService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultDetailService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultImageService;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultService;
import com.safasoft.mobilesurvey.rest.util.ImageUtil;

/**
 * Data controller, requested via AJAX
 * Handles and retrieves the data page depending on the URI template
 * A user must be log-in first he can access these pages
 * @created Jun 19, 2016
 * @author awal
 */
@RestController
public class DataController {

	//Service injection list
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private MasterUserService muServ;
	@Autowired
	private MasterParentParameterService mppServ;
	@Autowired
	private MasterParameterService mpServ;
	@Autowired
	private MasterQuestionService mqServ;
	@Autowired
	private MasterQuestionGroupService mqgServ;
	@Autowired
	private DetailQuestionGroupService dqgServ;
	@Autowired
	private MasterTemplateService mtServ;
	@Autowired
	private DetailTemplateService dtServ;
	@Autowired
	private MasterGroupParamService mgpServ;
	@Autowired
	private MasterProductService mprServ;
	@Autowired
	private MobileTaskAssignmentService mtaServ;
	@Autowired
	private MobileTaskResultService mtrServ;
	@Autowired
	private MobileTaskResultDetailService mtrdServ;
	@Autowired
	private MobileTaskResultDetailListService mtrdlServ;
	@Autowired
	private MobileTaskResultImageService mtriServ;
	@Autowired
	private MasterTaskStatusService mtsServ;
	@Autowired
	private GenericService genServ;
	@Autowired
	private MasterCompanyService mcServ;
	@Autowired
	private MasterOfficeService moServ;
	@Autowired
	private MasterDistributionService mdServ;
	@Autowired
	private MasterZipcodeVerificatorService mzvServ;
	@Autowired
	private MasterAbsenceService maServ;
	
	private final Logger logger = Logger.getLogger("others");
	
	//
	//private long today = System.currentTimeMillis();
	
	/*
	 * Purpose for testing rest
	 */
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public MasterUser getUser(
			@PathVariable("userId") int userId
			) {
		return muServ.getById(userId);
	}
	
	/**
	 * Get parameter list based on given company
	 * @param coyId, company
	 * @return container contains list of parameter
	 */
	@RequestMapping(value = "/parameter/{coyId}", method = RequestMethod.GET)
	public RestResponseBean getParameter(@PathVariable("coyId") int coyId) {
		return getRestResponseBean(mpServ.getByCoyDTO(coyId));
	}
	
	/**
	 * Get question list based on given company
	 * @param coyId, company
	 * @return container contains list of question
	 */	
	@RequestMapping(value = "/question/{coyId}", method = RequestMethod.GET)
	public RestResponseBean getQuestions(@PathVariable("coyId") int coyId) {
		return getRestResponseBean(mqServ.getAllByCoyDTO(coyId));
	}
	
	/**
	 * Get question based on given company and id 
	 * @param coyId, company 
	 * @param questId, question
	 * @return container contains question object
	 */
	@RequestMapping(value = "/question/{coyId}/{questId}", method = RequestMethod.GET)
	public RestResponseBean getQuestion(@PathVariable("coyId") int coyId, @PathVariable("questId") int questId) {
		return getRestResponseBean(mqServ.getByCoyAndIdDTO(coyId, questId));
	}

	/**
	 * Get question group list based on given company 
	 * @param coyId, company 
	 * @return container contains list of question group
	 */
	@RequestMapping(value = "/questiongroup/{coyId}", method = RequestMethod.GET)
	public RestResponseBean getQuestionGroups(@PathVariable("coyId") int coyId) {
		return getRestResponseBean(mqgServ.getAllByCoyDTO(coyId));
	}

	/**
	 * Get question group based on given company and id 
	 * @param coyId, company 
	 * @param questGroupId, question group
	 * @return container contains question group object
	 */
	@RequestMapping(value = "/questiongroup/{coyId}/{questGroupId}", method = RequestMethod.GET)
	public RestResponseBean getQuestionGroup(@PathVariable("coyId") int coyId, @PathVariable("questGroupId") int questGroupId) {
		return getRestResponseBean(mqgServ.getByCoyAndIdDTO(coyId, questGroupId));
	}

	/**
	 * Get detail question list based on given question group
	 * @param questGroupId, question group
	 * @return container contains list of detail question
	 */
	@RequestMapping(value = "/detailquestiongroup/{questGroupId}", method = RequestMethod.GET)
	public RestResponseBean getDetailQuestionGroups(@PathVariable("questGroupId") int questGroupId) {
		return getRestResponseBean(dqgServ.getAllByQuestGroupDTO(questGroupId));
	}

	/**
	 * Get detail question based on given question group and id
	 * @param questGroupId, question group 
	 * @param detailQuestGroupId, detail question 
	 * @return container contains detail question object
	 */
	@RequestMapping(value = "/detailquestiongroup/{questGroupId}/{detailQuestGroupId}", method = RequestMethod.GET)
	public RestResponseBean getDetailQuestionGroup(@PathVariable("questGroupId") int questGroupId, @PathVariable("detailQuestGroupId") int detailQuestGroupId) {
		return getRestResponseBean(dqgServ.getByQuestGroupAndIdDTO(questGroupId, detailQuestGroupId));
	}

	/**
	 * Get template list based on given company
	 * @param coyId, company 
	 * @return container contains list of template
	 */
	@RequestMapping(value = "/template/{coyId}", method = RequestMethod.GET)
	public RestResponseBean getTemplates(@PathVariable("coyId") int coyId) {
		return getRestResponseBean(mtServ.getAllByCoyDTO(coyId));
	}

	/**
	 * Get template based on given company and id
	 * @param coyId, company 
	 * @param tempId, template 
	 * @return container contains template object
	 */
	@RequestMapping(value = "/template/{coyId}/{tempId}", method = RequestMethod.GET)
	public RestResponseBean getTemplate(@PathVariable("coyId") int coyId, @PathVariable("tempId") int tempId) {
		return getRestResponseBean(mtServ.getByCoyAndIdDTO(coyId, tempId));
	}

	/**
	 * Get detail template list based on given template
	 * @param tempId, template
	 * @return container contains list of detail template
	 */
	@RequestMapping(value = "/detailtemplate/{tempId}", method = RequestMethod.GET)
	public RestResponseBean getDetailTemplates(@PathVariable("tempId") int tempId) {
		return getRestResponseBean(dtServ.getAllByTempDTO(tempId));
	}

	/**
	 * Get detail template based on given template and id
	 * @param tempId, template 
	 * @param detailTempId, detail template
	 * @return container contains detail template object
	 */
	@RequestMapping(value = "/detailtemplate/{tempId}/{detailTempId}", method = RequestMethod.GET)
	public RestResponseBean getDetailTemplate(@PathVariable("tempId") int tempId, @PathVariable("detailTempId") int detailTempId) {
		return getRestResponseBean(dtServ.getByTempAndIdDTO(tempId, detailTempId));
	}
		
	/**
	 * Get all group parameters
	 * @return list of all group parameters
	 */
	@RequestMapping(value = "/groupparam", method = RequestMethod.GET)
	public RestResponseBean getAllGroupParam() {
		return getRestResponseBean(mgpServ.getAll());
	}

	/**
	 * Get group parameter based on given code
	 * @param groupParamCode, the code
	 * @return container contains group parameter object
	 */
	@RequestMapping(value = "/groupparam/{groupParamCode}", method = RequestMethod.GET)
	public RestResponseBean getDetailParam(@PathVariable("groupParamCode") String groupParamCode) {
		return getRestResponseBean(mgpServ.getByGroupParamCode(groupParamCode));
	}

	/**
	 * Get option list based on given table
	 * @param tableName
	 * @return container contains list of option
	 */
	@RequestMapping(value = "/optionlist/{tableName}", method = RequestMethod.GET)
	public RestResponseBean getOptionList(@PathVariable("tableName") String tableName) {
		return getRestResponseBean(genServ.getTableContens(tableName));
	}

	/**
	 * Get product list based on given company
	 * @param coyId, company 
	 * @return container contains list of product
	 */
	@RequestMapping(value = "/product/{coyId}", method = RequestMethod.GET)
	public RestResponseBean getProducts(@PathVariable("coyId") int coyId) {
		return getRestResponseBean(mprServ.getAllByCoyDTO(coyId));
	}

	/**
	 * Get product based on given company and id
	 * @param coyId, company 
	 * @param productId, product
	 * @return container contains product object
	 */
	@RequestMapping(value = "/product/{coyId}/{productId}", method = RequestMethod.GET)
	public RestResponseBean getProduct(@PathVariable("coyId") int coyId, @PathVariable("productId") int productId) {
		return getRestResponseBean(mprServ.getByCoyAndIdDTO(coyId, productId));
	}
	
	/**
	 * Get result list based on given company
	 * @param coyCode, company
	 * @return container contains list of result
	 */
	@RequestMapping(value = "/result/{coyCode}", method = RequestMethod.GET)
	public RestResponseBean getResults(@PathVariable("coyCode") String coyCode) {
		
		MasterCompany coy = mcServ.getByCode(coyCode);//current company
		
		//send empty data if request has no company
		if(coy == null)
			return new RestResponseBean();
				
		List<MobileTaskResultDTO> resultDTOList = mtrServ.getByCoyDTO(coy.getCoyId());//assign a list
		
		//convert image from byte array to string base64, so they can send via JSON
		for(MobileTaskResultDTO resultDTO : resultDTOList) {
			List<MobileTaskResultDetailDTO> resultDetailDTOList = mtrdServ.getByResultDTO(resultDTO.getTaskResultId());
			for(MobileTaskResultDetailDTO resultDetailDTO : resultDetailDTOList) {
				List<MobileTaskResultDetailListDTO> resultDetailListDTOList = mtrdlServ.getByResultDetailDTO(resultDetailDTO.getTaskResultDetId());
				for(MobileTaskResultDetailListDTO resultDetailListDTO : resultDetailListDTOList) {
					resultDetailListDTO.setImageStr64(Base64.encodeBase64String(resultDetailListDTO.getImage()));
					resultDetailListDTO.setImage(null);
				}
				resultDetailDTO.setResultDetailLists(resultDetailListDTOList);
			}
			resultDTO.setResultDetails(resultDetailDTOList);
		}
		
		//return updated list
		return getRestResponseBean(resultDTOList);
	}
	
	/**
	 * Post result to be saved to database
	 * @param resultDto, result object
	 * @return container contain posted result
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public RestResponseBean saveResult(@RequestBody MobileTaskResultDTO resultDto)
			throws InvocationTargetException, IllegalAccessException {
		
		String userCode = resultDto.getUserCode();//assign user code

		//task section
		//assign task from result, its submit date and status
		//finally, save the task
		MobileTaskAssignment task = mtaServ.getById(resultDto.getTaskId());
		task.setSubmitDate(new Date(System.currentTimeMillis()));
		task.setTaskStatus(mtsServ.getByCode("SUBM"));
		mtaServ.save(task);
		//		
		
		//result section
		//initialize new result
		//copy data from result DTO to the object
		//then set the non-plain data (the object) separately
		//now the result ready to be used by others
		MobileTaskResult result = new MobileTaskResult();
		BeanUtils.copyProperties(result, resultDto);
		result.setCreatedBy(userCode);
		result.setUpdatedBy(userCode);
		result.setTask(mtaServ.getById(resultDto.getTaskId()));
		
		//result detail section
		//initialize new list of result detail
		//iterate over the list
		//initialize new result detail
		//copy data from result DTO to the object
		//then set the non-plain data (the object) separately
		//now the result detail ready to be used by others
		Set<MobileTaskResultDetail> resultDetails = new HashSet<>();
		for(MobileTaskResultDetailDTO resultDetailDto : resultDto.getResultDetails()) {
			MobileTaskResultDetail resultDetail = new MobileTaskResultDetail();
			BeanUtils.copyProperties(resultDetail, resultDetailDto);
			resultDetail.setCreatedBy(userCode);
			resultDetail.setUpdatedBy(userCode);
			resultDetail.setTaskResult(result);
			resultDetail.setQuestion(mqServ.getById(resultDetailDto.getQuestId()));
			
			//result detail list section
			//initialize new list of result detail list
			//iterate over the list
			//initialize new result detail list
			//copy data from result DTO to the object
			//then set the non-plain data (the object) separately
			//now the result detail list ready to be used by others
			Set<MobileTaskResultDetailList> resultDetailLists = new HashSet<>();
			for(MobileTaskResultDetailListDTO resultDetailListDto : resultDetailDto.getResultDetailLists()) {
				MobileTaskResultDetailList resultDetailList = new MobileTaskResultDetailList();
				BeanUtils.copyProperties(resultDetailList, resultDetailListDto);
				resultDetailList.setCreatedBy(userCode);
				resultDetailList.setUpdatedBy(userCode);
				resultDetailList.setTaskResultDetail(resultDetail);
				
				//result image section
				//assign string base64 of the image
				//initialize new result image
				//convert the string to the image and add the optional text if available 
				//put the image into result image object 
				String imageStr64 = resultDetailListDto.getImageStr64();
				if(!(imageStr64 == null || imageStr64.equals(""))) {
					MobileTaskResultImage resultImage = new MobileTaskResultImage();
					String imageText = resultDetailListDto.getImageText();
					if(!(imageText == null || imageText.equals(""))) {
						try {
							resultImage.setImage(ImageUtil.mergeImageAndText(Base64.decodeBase64(imageStr64),imageText.split(";"),20,20));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						resultImage.setImage(Base64.decodeBase64(imageStr64));
					}
					
					//assign result image to result detail list
					resultDetailList.setTaskResultImage(resultImage);
				}
				
				//assign result detail list to the list of result detail list
				resultDetailLists.add(resultDetailList);
			}
			
			//assign list of result detail list to result detail
			//put result detail to the list
			resultDetail.setTaskResultDetailLists(resultDetailLists);
			resultDetails.add(resultDetail);
		}
		
		//assign list of result detail to result, save the result and assign its id to the DTO
		result.setTaskResultDetails(resultDetails);
		result = mtrServ.save(result);
		resultDto.setTaskResultId(result.getTaskResultId());
		
		return getRestResponseBean(resultDto);
	}
	
	/**
	 * Get all task status
	 * @return container contains list of all task status
	 */
	@RequestMapping(value = "/taskstatus", method = RequestMethod.GET)
	public RestResponseBean getAllTaskStatus() {
		return getRestResponseBean(mtsServ.getAllDTO());
	}
	
	/**
	 * Get task by user
	 * @param userId
	 * @return container contains list of tasks
	 */
	@RequestMapping(value = "/task/{userId}", method = RequestMethod.GET)
	public RestResponseBean getDetailTemplate(@PathVariable("userId") int userId) {
		
		List<MobileTaskAssignmentDTO> taskDTOs = mtaServ.getByUserDTO(userId);//assign list of tasks
		MasterUser user = muServ.getById(userId);//assign user
		
		//currently have no task
		//if his office distribution method is round robin then retrieve task from the office by the following condition
		//		- user available (not in absence status)
		//		- user has no outstanding task (in retrieve and survey status)
		//		- both user and task has same zipcode
		//		- currently only one task is allowed to be sent
		if(taskDTOs.size() == 0) {
			MasterOffice office = user.getOffice();
			MasterDistribution dist = mdServ.getByOffice(office.getOfficeId());
			if(dist.getIsAutoDist().equals("true") && dist.getMethodType().equals("R") && maServ.countByUserToday(user.getUserId()) == 0) {
				if(mtaServ.countByUserAndTask(userId, "RETR") == 0 && mtaServ.countByUserAndTask(userId, "SURV") == 0) {
					for(MasterZipcodeVerificator mzv : mzvServ.getByVerificator(userId)) {
						taskDTOs = mtaServ.getByOfficeZipcodeTaskAndLimit(office.getOfficeId(), mzv.getZipcode().getZipcodeCode(), "ASSG", 1);
						if(!taskDTOs.isEmpty())
							break;
					}					
				}
			}
		} 
		
		// update task status first then send
		for(MobileTaskAssignmentDTO taskDTO : taskDTOs) {
			MobileTaskAssignment task = mtaServ.getById(taskDTO.getTaskId());
			task.setTaskStatus(mtsServ.getByCode("RETR"));
			task.setRetrieveDate(new Date(System.currentTimeMillis()));
			if(task.getUser() == null)
				task.setUser(user);
			mtaServ.save(task);
		}
		
		return getRestResponseBean(taskDTOs);
	}
	
	/**
	 * Post task to update the status in the database
	 * @param taskId
	 * @param userId
	 * @return container contains updated task
	 */
	@RequestMapping(value = "/task/update/{taskId}/{userId}", method = RequestMethod.POST)
	public RestResponseBean updateTaskStatus(@PathVariable("taskId") int taskId, @PathVariable("userId") int userId) {
		
		//return empty container if given task not belongs to the user anymore
		if(mtaServ.countByCurrentTaskAndUser(taskId, userId) == 0)
			return getRestResponseBean(null);
		
		//assign task,
		//update status to survey (currently available) and retrieve date to timestamp,
		//then save the task
		MobileTaskAssignment task = mtaServ.getById(taskId);
		task.setTaskStatus(mtsServ.getByCode("SURV"));
		task.setRetrieveDate(new Date(System.currentTimeMillis()));
		task = mtaServ.save(task);
		
		return getRestResponseBean(mtaServ.getByIdDTO(task.getTaskId()));
	}
	
	/**
	 * Post task to be saved to database
	 * @param taskDto
	 * @return container contains list of saved task 
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@RequestMapping(value = "/task/post", method = RequestMethod.POST)
	public RestResponseBean saveTask(@RequestBody MobileTaskAssignmentPostDTO taskDto)
			throws InvocationTargetException, IllegalAccessException {
		
		//assign user, order date and order/customer id
		MasterUser user = muServ.getById(taskDto.getUserId());
		long today = System.currentTimeMillis();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String idTemp =  user.getUserCode() + "-" + uuid;
		taskDto.setOrderId("order-" + idTemp);
		taskDto.setOrderDate(new Date(today));
		taskDto.setCustomerId("customer-" + idTemp);
		
		//initialize new task
		//copy data from task DTO to the object
		//then set the non-plain data (the object) separately
		//remember to verify auto survey setup before set task status either to new or survey
		//finally save the task
		MobileTaskAssignment task = new MobileTaskAssignment();
		BeanUtils.copyProperties(task, taskDto);
		MasterProduct product = mprServ.getById(taskDto.getProductId());
		task.setProduct(product);
		if(product.getIsAutoSurvey() != null && product.getIsAutoSurvey().equals("true")) {
			task.setUser(user);
			task.setReceiveDate(new Date(today));		
			task.setTaskStatus(mtsServ.getByCode("SURV"));
			task.setAssignmentDate(new Date(today));
			task.setRetrieveDate(new Date(today));
		} else {
			task.setUser(null);
			task.setTaskStatus(mtsServ.getByCode("NEW"));
			task.setReceiveDate(new Date(today));			
		}
		task.setOffice(user.getOffice());
		task.setCreatedBy(user.getUserCode());
		task.setUpdatedBy(user.getUserCode());
		task = mtaServ.save(task);
		
		//assign the DTO before return
		taskDto.setTaskId(task.getTaskId());
		taskDto.setTaskStatusId(task.getTaskStatus().getTaskStatusId());
		return getRestResponseBean(taskDto);
	}
	
	/**
	 * Post task to be saved to database based on given sender
	 * Apply on client only not on mobile
	 * @param taskDtoList, list of sending task
	 * @param senderId
	 * @return container contains list of saved tasks
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	@RequestMapping(value = "/task/post/{senderId}", method = RequestMethod.POST)
	public RestResponseBean saveTaskClient (
			@RequestBody List<MobileTaskAssignmentPostDTO> taskDtoList,
			@PathVariable("senderId") int senderId)
					throws InvocationTargetException, IllegalAccessException {
		
		//initialize new list of success task
		//iterate over the sending list
		//assign new user and product
		//initialize new task
		//copy data from result DTO to the object
		//then set the non-plain data (the object) separately
		//now the task ready to be added to the list
		List<Integer> taskIdSuccessList = new ArrayList<>(); 
		for(MobileTaskAssignmentPostDTO taskDto : taskDtoList) {
			MasterUser user = muServ.getById(senderId);
			MobileTaskAssignment task = new MobileTaskAssignment();
			BeanUtils.copyProperties(task, taskDto);
			MasterProduct product = mprServ.getById(taskDto.getProductId());
			task.setOffice(moServ.getById(taskDto.getOfficeId()));
			task.setProduct(product);
			task.setTaskStatus(mtsServ.getByCode("NEW"));
			task.setReceiveDate(new Date(System.currentTimeMillis()));
			task.setCreatedBy(user.getUserCode());
			task.setUpdatedBy(user.getUserCode());
			task = mtaServ.save(task);
			taskIdSuccessList.add(task.getTaskId());
		}
		return getRestResponseBean(taskIdSuccessList);
	}
	
	/*
	 * Purpose for testing only
	 */
	@RequestMapping(value = "/task/image/jointext/{imageId}", method = RequestMethod.POST)
	public RestResponseBean joinTextToImage(@PathVariable int imageId) {
		RestResponseBean rrb = new RestResponseBean();
		MobileTaskResultImage image = mtriServ.getById(imageId);
		byte[] insTxtPic;
		try {
			String[] str = "Contoh text yg panjang".split(";");
			insTxtPic = ImageUtil.mergeImageAndText(image.getImage(), str, 20, 20);
			image.setImage(insTxtPic);
			mtriServ.save(image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rrb.setContents(image);
		return rrb;
	}
	
	/**
	 * we need to test the rest first before mobile can use it 
	 * @return container contains url for testing
	 */
	@RequestMapping(value = "/test/setuplink", method = RequestMethod.GET)
	public RestResponseBean testSetupLink() {
		RestResponseBean rrb = new RestResponseBean();
		rrb.setStatus(0);
		rrb.setStatusName("success");
		StringBean sb = new StringBean();
		try {
			URL requestUrl = new URL(request.getRequestURL().toString());
			String port = requestUrl.getPort() == -1 ? "" : ":" + requestUrl.getPort();
			sb.setValue(requestUrl.getProtocol() + "://" + requestUrl.getHost() + port + requestUrl.getPath());			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rrb.setContents(sb);
		return rrb;
	}
	
	//get the container of objects
	private RestResponseBean getRestResponseBean(Object contents) {
		RestResponseBean rrb = new RestResponseBean();
		//proceed if user has session
		/*if(new ServerAuthentication().isAuthentication(request.getSession().getId())) {
			if(contents == null) {
				rrb.setStatus(15);
				rrb.setStatusName("no data found");
			}
			rrb.setContents(contents);
		//otherwise, denied the request 
		} else {
			rrb.setStatus(11);
			rrb.setStatusName("auth fail");	
			rrb.setContents(null);
		}*/
		rrb.setContents(contents);
		return rrb;
	}
	
}
