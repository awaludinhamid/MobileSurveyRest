package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstRelationDest;

public interface CmTghMstRelationDestService {

  List<CmTghMstRelationDest> save(List<CmTghMstRelationDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}