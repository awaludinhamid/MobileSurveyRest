package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiLkriDtlDest;

public interface CfinTrnRiLkriDtlDestService {

  List<CfinTrnRiLkriDtlDest> save(List<CfinTrnRiLkriDtlDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}