package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstAreaSpvDest;

public interface CmTghMstAreaSpvDestService {

  List<CmTghMstAreaSpvDest> save(List<CmTghMstAreaSpvDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}