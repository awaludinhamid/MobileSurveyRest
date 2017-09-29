package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.dao.MasterParameterDAO;
import com.safasoft.mobilesurvey.rest.dto.MasterParameterDTO;
import com.safasoft.mobilesurvey.rest.service.MasterParameterService;

/**	
 * Parameter service implementation (see the service for usage info)
 * @created Nov 18, 2016
 * @author awal
 */
@Service("masterParameterService")
@Transactional(readOnly=true)
public class MasterParameterServiceImpl implements MasterParameterService {

	@Autowired
	private MasterParameterDAO masterParameterDAO;// DAO injection

	public List<MasterParameterDTO> getAllByCoyDTO(int coyId) {
		// TODO Auto-generated method stub
		return masterParameterDAO.getAllByCoyDTO(coyId);
	}

	@Override
	public List<MasterParameterDTO> getByCoyDTO(int coyId) {
		// TODO Auto-generated method stub
		return masterParameterDAO.getByCoyDTO(coyId);
	}
}
