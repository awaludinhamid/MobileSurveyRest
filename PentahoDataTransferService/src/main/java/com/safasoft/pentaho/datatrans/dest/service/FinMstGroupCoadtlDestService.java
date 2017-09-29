package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstGroupCoadtlDest;

public interface FinMstGroupCoadtlDestService {

  List<FinMstGroupCoadtlDest> save(List<FinMstGroupCoadtlDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}