package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.dao.MasterTemplateDAO;
import com.safasoft.mobilesurvey.rest.dto.MasterTemplateDTO;
import com.safasoft.mobilesurvey.rest.service.MasterTemplateService;

/**	
 * Template service implementation (see the service for usage info)
 * @created Jan 15, 2017
 * @author awal
 */
@Service("masterTemplateService")
@Transactional(readOnly=true)
public class MasterTemplateServiceImpl implements MasterTemplateService {

	@Autowired
	private MasterTemplateDAO masterTemplateDAO;// DAO injection

	@Override
	public List<MasterTemplateDTO> getAllByCoyDTO(int coyId) {
		// TODO Auto-generated method stub
		return masterTemplateDAO.getAllByCoyDTO(coyId);
	}

	@Override
	public MasterTemplateDTO getByCoyAndIdDTO(int coyId, int tempId) {
		// TODO Auto-generated method stub
		return masterTemplateDAO.getByCoyAndIdDTO(coyId, tempId);
	}
	
}
