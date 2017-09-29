package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResult;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResult;
import com.safasoft.mobilesurvey.rest.dao.MobileTaskResultDAO;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDTO;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultService;

/**	
 * Result service implementation (see the service for usage info)
 * @created Feb 13, 2017
 * @author awal
 */
@Service("mobileTaskResultService")
@Transactional(readOnly=true)
public class MobileTaskResultServiceImpl implements MobileTaskResultService {

	@Autowired
	private MobileTaskResultDAO mobileTaskResultDAO;// DAO injection

	@Override
	@Transactional(readOnly=false)
	public MobileTaskResult save(MobileTaskResult result) {
		// TODO Auto-generated method stub
		return mobileTaskResultDAO.save(result);
	}

	@Override
	@Transactional(readOnly=false)
	public List<MobileTaskResult> save(List<MobileTaskResult> resultList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return mobileTaskResultDAO.save(resultList, numOfBulkRecord);
	}

	@Override
	public MobileTaskResult getById(int taskResultId) {
		// TODO Auto-generated method stub
		return mobileTaskResultDAO.getById(taskResultId);
	}

	@Override
	public List<MobileTaskResult> getByCoy(int coyId) {
		// TODO Auto-generated method stub
		return mobileTaskResultDAO.getByCoy(coyId);
	}

	@Override
	public List<MobileTaskResultDTO> getByCoyDTO(int coyId) {
		// TODO Auto-generated method stub
		return mobileTaskResultDAO.getByCoyDTO(coyId);
	}

	@Override
	public List<TaskResult> getByCoyAndStatusResult(String coyCode, String taskStatusCode) {
		// TODO Auto-generated method stub
		return mobileTaskResultDAO.getByCoyAndStatusResult(coyCode, taskStatusCode);
	}
}
