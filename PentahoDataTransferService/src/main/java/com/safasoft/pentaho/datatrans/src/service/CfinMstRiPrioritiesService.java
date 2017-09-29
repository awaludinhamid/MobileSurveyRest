package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiPriorities;

public interface CfinMstRiPrioritiesService {

	List<CfinMstRiPriorities> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
