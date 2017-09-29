package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstCardIssuerDest;

public interface FinMstCardIssuerDestService {

  List<FinMstCardIssuerDest> save(List<FinMstCardIssuerDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}