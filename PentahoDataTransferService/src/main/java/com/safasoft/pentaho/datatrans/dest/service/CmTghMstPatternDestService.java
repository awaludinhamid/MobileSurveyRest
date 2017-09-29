package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPatternDest;

public interface CmTghMstPatternDestService {

  List<CmTghMstPatternDest> save(List<CmTghMstPatternDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}