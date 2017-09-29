package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiFamilyMeetDest;

public interface CfinMstRiFamilyMeetDestService {

	List<CfinMstRiFamilyMeetDest> save(List<CfinMstRiFamilyMeetDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
