package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstCfgacctDest;

public interface CfinMstCfgacctDestService {

  List<CfinMstCfgacctDest> save(List<CfinMstCfgacctDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}