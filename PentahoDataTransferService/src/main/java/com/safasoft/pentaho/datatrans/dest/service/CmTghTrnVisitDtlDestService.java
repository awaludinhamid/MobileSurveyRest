package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghTrnVisitDtlDest;

public interface CmTghTrnVisitDtlDestService {

  List<CmTghTrnVisitDtlDest> save(List<CmTghTrnVisitDtlDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}