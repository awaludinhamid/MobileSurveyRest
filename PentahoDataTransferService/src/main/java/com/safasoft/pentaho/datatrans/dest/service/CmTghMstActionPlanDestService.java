package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstActionPlanDest;

public interface CmTghMstActionPlanDestService {

  List<CmTghMstActionPlanDest> save(List<CmTghMstActionPlanDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}