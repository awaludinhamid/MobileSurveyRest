package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultDetailList;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultDetailList;
import com.safasoft.mobilesurvey.rest.dao.MobileTaskResultDetailListDAO;
import com.safasoft.mobilesurvey.rest.dto.MobileTaskResultDetailListDTO;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultDetailListService;

/**	
 * Result detail list service implementation (see the service for usage info)
 * @author awal
 * @created Feb 19, 2017
 */
@Service("mobileTaskResultDetailListService")
@Transactional(readOnly=true)
public class MobileTaskResultDetailListServiceImpl implements MobileTaskResultDetailListService {

	@Autowired
	private MobileTaskResultDetailListDAO mobileTaskResultDetailListDAO;// DAO injection

	@Override
	@Transactional(readOnly=false)
	public List<MobileTaskResultDetailList> save(List<MobileTaskResultDetailList> resultDetailListList,
			int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return mobileTaskResultDetailListDAO.save(resultDetailListList, numOfBulkRecord);
	}

	@Override
	public List<MobileTaskResultDetailListDTO> getByResultDetailDTO(int taskResultDetId) {
		// TODO Auto-generated method stub
		return mobileTaskResultDetailListDAO.getByResultDetailDTO(taskResultDetId);
	}

	@Override
	public List<TaskResultDetailList> getByCoyAndStatusResult(String coyCode, String taskStatusCode) {
		// TODO Auto-generated method stub
		return mobileTaskResultDetailListDAO.getByCoyAndStatusResult(coyCode, taskStatusCode);
	}
}
