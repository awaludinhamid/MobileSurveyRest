package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterZipcodeVerificator;
import com.safasoft.mobilesurvey.rest.dao.MasterZipcodeVerificatorDAO;
import com.safasoft.mobilesurvey.rest.service.MasterZipcodeVerificatorService;

/**	
 * Zipcode service implementation (see the service for usage info)
 * @created Nov 26, 2016
 * @author awal
 */
@Service("masterZipcodeVerificatorService")
@Transactional(readOnly=true)
public class MasterZipcodeVerificatorServiceImpl implements MasterZipcodeVerificatorService {

	@Autowired
	private MasterZipcodeVerificatorDAO masterZipcodeVerificatorDAO;// DAO injection

	@Override
	public List<MasterZipcodeVerificator> getByVerificator(int verificatorId) {
		// TODO Auto-generated method stub
		return masterZipcodeVerificatorDAO.getByVerificator(verificatorId);
	}
}
