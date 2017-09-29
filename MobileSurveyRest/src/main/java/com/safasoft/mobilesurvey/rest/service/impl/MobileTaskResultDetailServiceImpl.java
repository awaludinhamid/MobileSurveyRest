package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetail;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetail;
import com.safasoft.mobilesurvey.rest.dao.MobileTaskResultDetailDAO;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDetailDTO;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultDetailService;

/**	
 * Result detail service implementation (see the service for usage info)
 * @author awal
 * @created Feb 20, 2017
 */
@Service("mobileTaskResultDetailService")
@Transactional(readOnly=true)
public class MobileTaskResultDetailServiceImpl implements MobileTaskResultDetailService {

	@Autowired
	private MobileTaskResultDetailDAO mobileTaskResultDetailDAO;// DAO injection

	@Override
	@Transactional(readOnly=false)
	public List<MobileTaskResultDetail> save(List<MobileTaskResultDetail> resultDetailList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return mobileTaskResultDetailDAO.save(resultDetailList, numOfBulkRecord);
	}

	@Override
	public MobileTaskResultDetail getById(int taskResultDetailId) {
		// TODO Auto-generated method stub
		return mobileTaskResultDetailDAO.getById(taskResultDetailId);
	}

	@Override
	public List<MobileTaskResultDetailDTO> getByResultDTO(int taskResultId) {
		// TODO Auto-generated method stub
		return mobileTaskResultDetailDAO.getByResultDTO(taskResultId);
	}

	@Override
	public List<TaskResultDetail> getByCoyAndStatusResult(String coyCode, String taskStatusCode) {
		// TODO Auto-generated method stub
		return mobileTaskResultDetailDAO.getByCoyAndStatusResult(coyCode, taskStatusCode);
	}
}
