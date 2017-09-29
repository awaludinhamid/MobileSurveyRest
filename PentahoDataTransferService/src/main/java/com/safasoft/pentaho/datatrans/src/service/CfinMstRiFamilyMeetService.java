package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiFamilyMeet;

public interface CfinMstRiFamilyMeetService {

	List<CfinMstRiFamilyMeet> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
