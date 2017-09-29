package com.safasoft.mobilesurvey.rest.service;

import java.util.List;

import com.safasoft.mobilesurvey.rest.bean.MasterProduct;
import com.safasoft.mobilesurvey.rest.dto.MasterProductDTO;

/**
 * SPI of product module
 * @created Jan 5, 2017
 * @author awal
 */
public interface MasterProductService {

	/**
	 * Get product by id
	 * @param productId
	 * @return product object based on given id
	 */
	MasterProduct getById(int productId);

	/**
	 * Get product data by company
	 * @param coyId company
	 * @return list of products based on given company
	 */
	List<MasterProductDTO> getAllByCoyDTO(int coyId);
	
	/**
	 * Get product data by company and id
	 * @param coyId company
	 * @param productId
	 * @return product object based on given company and id
	 */
	MasterProductDTO getByCoyAndIdDTO(int coyId, int productId);
}
