package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrPeopleAllDest;

public interface HrPeopleAllDestService {

  List<HrPeopleAllDest> save(List<HrPeopleAllDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}