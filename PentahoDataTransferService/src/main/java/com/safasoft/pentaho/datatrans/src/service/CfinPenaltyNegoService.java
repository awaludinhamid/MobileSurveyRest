package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinPenaltyNego;

public interface CfinPenaltyNegoService {

	List<CfinPenaltyNego> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
