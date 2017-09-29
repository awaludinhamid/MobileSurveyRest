package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghTrnVisitHdrDest;

public interface CmTghTrnVisitHdrDestService {

  List<CmTghTrnVisitHdrDest> save(List<CmTghTrnVisitHdrDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}