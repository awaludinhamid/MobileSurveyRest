package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstJobDest;

public interface HrMstJobDestService {

  List<HrMstJobDest> save(List<HrMstJobDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}