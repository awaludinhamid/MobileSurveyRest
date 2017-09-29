package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterGroupParam;
import com.safasoft.mobilesurvey.rest.dao.MasterGroupParamDAO;
import com.safasoft.mobilesurvey.rest.service.MasterGroupParamService;

/**
 * Group parameter service implementation (see the service for usage info)
 * @created Dec 4, 2016
 * @author awal
 */
@Service("masterGroupParamService")
@Transactional(readOnly=true)
public class MasterGroupParamServiceImpl implements MasterGroupParamService {

	@Autowired
	private MasterGroupParamDAO masterGroupParamDAO;// DAO injection

	@Override
	public List<MasterGroupParam> getAll() {
		// TODO Auto-generated method stub
		return masterGroupParamDAO.getAll();
	}

	@Override
	public MasterGroupParam getByGroupParamCode(String groupParamCode) {
		// TODO Auto-generated method stub
		return masterGroupParamDAO.getByGroupParamCode(groupParamCode);
	}
}
