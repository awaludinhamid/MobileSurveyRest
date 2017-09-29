package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterQuestion;
import com.safasoft.mobilesurvey.rest.dao.MasterQuestionDAO;
import com.safasoft.mobilesurvey.rest.dto.MasterQuestionDTO;
import com.safasoft.mobilesurvey.rest.service.MasterQuestionService;

/**	
 * Question service implementation (see the service for usage info)
 * @created Jan 5, 2017
 * @author awal
 */
@Service("masterQuestionService")
@Transactional(readOnly=true)
public class MasterQuestionServiceImpl implements MasterQuestionService {

	@Autowired
	private MasterQuestionDAO masterQuestionDAO;// DAO injection

	public MasterQuestion getById(int questId) {
		// TODO Auto-generated method stub
		return masterQuestionDAO.getById(questId);
	}

	public List<MasterQuestion> getAll() {
		// TODO Auto-generated method stub
		return masterQuestionDAO.getAll();
	}

	public List<MasterQuestionDTO> getAllByCoyDTO(int coyId) {
		// TODO Auto-generated method stub
		return masterQuestionDAO.getAllByCoyDTO(coyId);
	}

	public MasterQuestionDTO getByCoyAndIdDTO(int coyId, int questId) {
		// TODO Auto-generated method stub
		return masterQuestionDAO.getByCoyAndIdDTO(coyId, questId);
	}
}
