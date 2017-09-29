package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstRelationDest;

public interface HrMstRelationDestService {

  List<HrMstRelationDest> save(List<HrMstRelationDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}