package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstEmployeeStsDest;

public interface HrMstEmployeeStsDestService {

  List<HrMstEmployeeStsDest> save(List<HrMstEmployeeStsDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}