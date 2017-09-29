package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrDeptAllDest;

public interface HrDeptAllDestService {

  List<HrDeptAllDest> save(List<HrDeptAllDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}