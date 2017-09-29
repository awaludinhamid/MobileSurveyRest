package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinTrnbankBalanceDest;

public interface FinTrnbankBalanceDestService {

  List<FinTrnbankBalanceDest> save(List<FinTrnbankBalanceDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}