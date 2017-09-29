package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstReligionDest;

public interface ApplMstReligionDestService {

	List<ApplMstReligionDest> save(List<ApplMstReligionDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
