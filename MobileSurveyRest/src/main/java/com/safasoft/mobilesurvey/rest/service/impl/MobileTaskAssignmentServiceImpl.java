package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskAssignment;
import com.safasoft.mobilesurvey.rest.client.bean.OrderTask;
import com.safasoft.mobilesurvey.rest.dao.MobileTaskAssignmentDAO;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskAssignmentDTO;
import com.safasoft.mobilesurvey.rest.service.MobileTaskAssignmentService;

/**	
 * Task service implementation (see the service for usage info)
 * @created Feb 2, 2017
 * @author awal
 */
@Service("mobileTaskAssignmentService")
@Transactional(readOnly=true)
public class MobileTaskAssignmentServiceImpl implements MobileTaskAssignmentService {

	@Autowired
	private MobileTaskAssignmentDAO mobileTaskAssignmentDAO;// DAO injection

	@Override
	@Transactional(readOnly=false)
	public MobileTaskAssignment save(MobileTaskAssignment task) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.save(task);
	}

	@Override
	public List<MobileTaskAssignmentDTO> getByUserDTO(int userId) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getByUserDTO(userId);
	}

	@Override
	public MobileTaskAssignment getById(int taskId) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getById(taskId);
	}

	@Override
	public MobileTaskAssignmentDTO getByIdDTO(int taskId) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getByIdDTO(taskId);
	}

	@Override
	public List<MobileTaskAssignment> getByCoyAndStatus(String coyCode, String taskStatusCode) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getByCoyAndStatus(coyCode, taskStatusCode);
	}

	@Override
	public List<MobileTaskAssignment> save(List<MobileTaskAssignment> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.save(domain, bulkRecord);
	}

	@Override
	public List<MobileTaskAssignmentDTO> getByCoyAndStatusDTO(String coyCode, String taskStatusCode) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getByCoyAndStatusDTO(coyCode, taskStatusCode);
	}

	@Override
	public List<OrderTask> getByCoyAndStatusOrder(String coyCode, String taskStatusCode) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getByCoyAndStatusOrder(coyCode, taskStatusCode);
	}

	@Override
	public MobileTaskAssignment getByOrder(String orderId) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getByOrder(orderId);
	}

	@Override
	public List<MobileTaskAssignmentDTO> getByOfficeTaskAndLimit(int officeId, String taskStatusCode, int limit) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getByOfficeTaskAndLimit(officeId, taskStatusCode, limit);
	}

	@Override
	public int countByUserAndTask(int userId, String taskStatusCode) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.countByUserAndTask(userId, taskStatusCode);
	}

	@Override
	public List<MobileTaskAssignmentDTO> getByOfficeZipcodeTaskAndLimit(int officeId, String zipcode,
			String taskStatusCode, int limit) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.getByOfficeZipcodeTaskAndLimit(officeId, zipcode, taskStatusCode, limit);
	}

	@Override
	public int countByCurrentTaskAndUser(int taskId, int userId) {
		// TODO Auto-generated method stub
		return mobileTaskAssignmentDAO.countByCurrentTaskAndUser(taskId, userId);
	}
}
