package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterTaskStatus;
import com.safasoft.mobilesurvey.rest.dao.MasterTaskStatusDAO;
import com.safasoft.mobilesurvey.rest.dto.MasterTaskStatusDTO;
import com.safasoft.mobilesurvey.rest.service.MasterTaskStatusService;

/**	
 * Task status service implementation (see the service for usage info)
 * @created Feb 8, 2017
 * @author awal
 */
@Service("masterTaskStatusService")
@Transactional(readOnly=true)
public class MasterTaskStatusServiceImpl implements MasterTaskStatusService {

	@Autowired
	private MasterTaskStatusDAO masterTaskStatusDAO;// DAO injection

	@Override
	public List<MasterTaskStatus> getAll() {
		// TODO Auto-generated method stub
		return masterTaskStatusDAO.getAll();
	}

	@Override
	public List<MasterTaskStatusDTO> getAllDTO() {
		// TODO Auto-generated method stub
		return masterTaskStatusDAO.getAllDTO();
	}

	@Override
	public MasterTaskStatus getById(int taskStatusId) {
		// TODO Auto-generated method stub
		return masterTaskStatusDAO.getById(taskStatusId);
	}

	@Override
	public MasterTaskStatus getByCode(String taskStatusCode) {
		// TODO Auto-generated method stub
		return masterTaskStatusDAO.getByCode(taskStatusCode);
	}
}
