package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstAreaZonaDest;

public interface CmTghMstAreaZonaDestService {

  List<CmTghMstAreaZonaDest> save(List<CmTghMstAreaZonaDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}