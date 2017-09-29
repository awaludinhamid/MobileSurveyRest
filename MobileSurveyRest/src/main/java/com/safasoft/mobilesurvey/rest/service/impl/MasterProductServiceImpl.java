package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.MasterProduct;
import com.safasoft.mobilesurvey.rest.dao.MasterProductDAO;
import com.safasoft.mobilesurvey.rest.dto.MasterProductDTO;
import com.safasoft.mobilesurvey.rest.service.MasterProductService;

/**	
 * Product service implementation (see the service for usage info)
 * @created Jan 5, 2017
 * @author awal
 */
@Service("masterProductService")
@Transactional(readOnly=true)
public class MasterProductServiceImpl implements MasterProductService {

	@Autowired
	private MasterProductDAO masterProductDAO;// DAO injection

	@Override
	public MasterProduct getById(int productId) {
		// TODO Auto-generated method stub
		return masterProductDAO.getById(productId);
	}

	@Override
	public List<MasterProductDTO> getAllByCoyDTO(int coyId) {
		// TODO Auto-generated method stub
		return masterProductDAO.getAllByCoyDTO(coyId);
	}

	@Override
	public MasterProductDTO getByCoyAndIdDTO(int coyId, int productId) {
		// TODO Auto-generated method stub
		return masterProductDAO.getByCoyAndIdDTO(coyId, productId);
	}
}
