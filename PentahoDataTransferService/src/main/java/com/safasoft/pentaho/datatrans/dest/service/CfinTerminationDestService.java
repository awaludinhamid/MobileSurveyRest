package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTerminationDest;

public interface CfinTerminationDestService {

  List<CfinTerminationDest> save(List<CfinTerminationDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}