package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.dao.DetailTemplateDAO;
import com.safasoft.mobilesurvey.rest.dto.DetailTemplateDTO;
import com.safasoft.mobilesurvey.rest.service.DetailTemplateService;

/**
 * Detail template service implementation (see the service for usage info)
 * @author awal
 * @created Mar 22, 2017
 */
@Service("detailTemplateService")
@Transactional(readOnly=true)
public class DetailTemplateServiceImpl implements DetailTemplateService {

	@Autowired
	private DetailTemplateDAO detailTemplateDAO;// DAO injection

	@Override
	public List<DetailTemplateDTO> getAllByTempDTO(int tempId) {
		// TODO Auto-generated method stub
		return detailTemplateDAO.getAllByTempDTO(tempId);
	}

	@Override
	public DetailTemplateDTO getByTempAndIdDTO(int tempId, int detailTempId) {
		// TODO Auto-generated method stub
		return detailTemplateDAO.getByTempAndIdDTO(tempId, detailTempId);
	}
}
