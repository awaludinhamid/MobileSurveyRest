package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstTrxdtlDest;

public interface FinMstTrxdtlDestService {

  List<FinMstTrxdtlDest> save(List<FinMstTrxdtlDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}