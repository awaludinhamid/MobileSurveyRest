package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinTrncashBalanceDest;

public interface FinTrncashBalanceDestService {

  List<FinTrncashBalanceDest> save(List<FinTrncashBalanceDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}