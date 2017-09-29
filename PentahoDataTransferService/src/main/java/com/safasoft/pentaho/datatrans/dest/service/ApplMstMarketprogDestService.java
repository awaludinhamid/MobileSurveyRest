package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstMarketprogDest;

public interface ApplMstMarketprogDestService {

  List<ApplMstMarketprogDest> save(List<ApplMstMarketprogDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}