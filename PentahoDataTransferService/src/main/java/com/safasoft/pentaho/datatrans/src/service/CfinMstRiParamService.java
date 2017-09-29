package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiParam;

public interface CfinMstRiParamService {

	List<CfinMstRiParam> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
