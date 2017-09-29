package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterParentParameter;
import com.safasoft.mobilesurvey.rest.dao.MasterParentParameterDAO;
import com.safasoft.mobilesurvey.rest.service.MasterParentParameterService;

/**	
 * Parent parameter service implementation (see the service for usage info)
 * @author awal
 * @created Mar 14, 2017
 */
@Service("masterParentParameterService")
@Transactional(readOnly=true)
public class MasterParentParameterServiceImpl implements MasterParentParameterService {

	@Autowired
	private MasterParentParameterDAO masterParentParameterDAO;// DAO injection

	@Override
	public List<MasterParentParameter> getByCoyDTO(int coyId) {
		// TODO Auto-generated method stub
		return masterParentParameterDAO.getByCoyDTO(coyId);
	}
}
