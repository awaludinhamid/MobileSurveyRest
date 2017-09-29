package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiRepayHistoryDest;

public interface CfinTrnRiRepayHistoryDestService {

  List<CfinTrnRiRepayHistoryDest> save(List<CfinTrnRiRepayHistoryDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}