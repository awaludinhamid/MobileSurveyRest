package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCustindCat;

public interface ApplCustindCatService {

	List<ApplCustindCat> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
