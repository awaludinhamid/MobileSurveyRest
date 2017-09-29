package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.dao.MasterQuestionGroupDAO;
import com.safasoft.mobilesurvey.rest.dto.MasterQuestionGroupDTO;
import com.safasoft.mobilesurvey.rest.service.MasterQuestionGroupService;

/**	
 * Question group service implementation (see the service for usage info)
 * @created Jan 10, 2017
 * @author awal
 */
@Service("masterQuestionGroupService")
@Transactional(readOnly=true)
public class MasterQuestionGroupServiceImpl implements MasterQuestionGroupService {
	
	@Autowired
	private MasterQuestionGroupDAO masterQuestionGroupDAO;// DAO injection

	public List<MasterQuestionGroupDTO> getAllByCoyDTO(int coyId) {
		// TODO Auto-generated method stub
		return masterQuestionGroupDAO.getAllByCoyDTO(coyId);
	}

	public MasterQuestionGroupDTO getByCoyAndIdDTO(int coyId, int questGroupId) {
		// TODO Auto-generated method stub
		return masterQuestionGroupDAO.getByCoyAndIdDTO(coyId, questGroupId);
	}
	
}
