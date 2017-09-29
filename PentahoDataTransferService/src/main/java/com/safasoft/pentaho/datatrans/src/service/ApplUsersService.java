package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplUsers;

public interface ApplUsersService {

	List<ApplUsers> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
