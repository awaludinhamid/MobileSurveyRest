package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstorgTypeDest;

public interface HrMstorgTypeDestService {

  List<HrMstorgTypeDest> save(List<HrMstorgTypeDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}