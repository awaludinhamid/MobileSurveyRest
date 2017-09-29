package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstClassificationsDest;

public interface CmTghMstClassificationsDestService {

  List<CmTghMstClassificationsDest> save(List<CmTghMstClassificationsDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}