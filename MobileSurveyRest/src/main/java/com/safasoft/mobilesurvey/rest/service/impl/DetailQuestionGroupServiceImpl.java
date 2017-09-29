package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.dao.DetailQuestionGroupDAO;
import com.safasoft.mobilesurvey.rest.dto.DetailQuestionGroupDTO;
import com.safasoft.mobilesurvey.rest.service.DetailQuestionGroupService;

/**
 * Detail question group service implementation (see the service for usage info)
 * @created Jan 11, 2017
 * @author awal
 */
@Service("detailQuestionGroupService")
@Transactional(readOnly=true)
public class DetailQuestionGroupServiceImpl implements DetailQuestionGroupService {

	@Autowired
	private DetailQuestionGroupDAO detailQuestionGroupDAO;// DAO injection

	public List<DetailQuestionGroupDTO> getAllByQuestGroupDTO(int questGroupId) {
		// TODO Auto-generated method stub
		return detailQuestionGroupDAO.getAllByQuestGroupDTO(questGroupId);
	}

	public DetailQuestionGroupDTO getByQuestGroupAndIdDTO(int questGroupId,
			int detailQuestGroupId) {
		// TODO Auto-generated method stub
		return detailQuestionGroupDAO.getByQuestGroupAndIdDTO(questGroupId, detailQuestGroupId);
	}
}
