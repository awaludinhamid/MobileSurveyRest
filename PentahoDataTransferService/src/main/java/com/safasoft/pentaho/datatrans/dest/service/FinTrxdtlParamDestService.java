package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinTrxdtlParamDest;

public interface FinTrxdtlParamDestService {

  List<FinTrxdtlParamDest> save(List<FinTrxdtlParamDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}