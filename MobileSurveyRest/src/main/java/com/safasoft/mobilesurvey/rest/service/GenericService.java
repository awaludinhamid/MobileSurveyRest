package com.safasoft.mobilesurvey.rest.service;

import com.safasoft.mobilesurvey.rest.bean.support.TableContentsBean;

/**
 * SPI of various module
 * @created Jan 9, 2017
 * @author awal
 */
public interface GenericService {

  /**
   * Get table contents by table 
   * @param tableName
   * @return table contents based on given table
   */
	TableContentsBean getTableContens(String tableName);
}
