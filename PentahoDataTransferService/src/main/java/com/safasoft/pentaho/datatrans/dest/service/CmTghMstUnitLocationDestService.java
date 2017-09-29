package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstUnitLocationDest;

public interface CmTghMstUnitLocationDestService {

  List<CmTghMstUnitLocationDest> save(List<CmTghMstUnitLocationDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}