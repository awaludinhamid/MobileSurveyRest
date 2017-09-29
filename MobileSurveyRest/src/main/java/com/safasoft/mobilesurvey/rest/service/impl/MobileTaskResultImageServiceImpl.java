package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MobileTaskResultImage;
import com.safasoft.mobilesurvey.rest.client.bean.TaskResultImage;
import com.safasoft.mobilesurvey.rest.dao.MobileTaskResultImageDAO;
import com.safasoft.mobilesurvey.rest.service.MobileTaskResultImageService;

/**	
 * Result image service implementation (see the service for usage info)
 * @author awal
 * @created Feb 20, 2017
 */
@Service("mobileTaskResultImageService")
@Transactional(readOnly=true)
public class MobileTaskResultImageServiceImpl implements MobileTaskResultImageService {

	@Autowired
	private MobileTaskResultImageDAO mobileTaskResultImageDAO;// DAO injection

	@Override
	@Transactional(readOnly=false)
	public MobileTaskResultImage save(MobileTaskResultImage taskresultImage) {
		// TODO Auto-generated method stub
		return mobileTaskResultImageDAO.save(taskresultImage);
	}

	@Override
	@Transactional(readOnly=false)
	public List<MobileTaskResultImage> save(List<MobileTaskResultImage> resultList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return mobileTaskResultImageDAO.save(resultList, numOfBulkRecord);
	}

	@Override
	public MobileTaskResultImage getById(int imageId) {
		// TODO Auto-generated method stub
		return mobileTaskResultImageDAO.getById(imageId);
	}

	@Override
	public List<TaskResultImage> getByCoyAndStatusResult(String coyCode, String taskStatusCode) {
		// TODO Auto-generated method stub
		return mobileTaskResultImageDAO.getByCoyAndStatusResult(coyCode, taskStatusCode);
	}
}
