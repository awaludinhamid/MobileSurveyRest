package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinRvhdrMstparamDest;

public interface FinRvhdrMstparamDestService {

  List<FinRvhdrMstparamDest> save(List<FinRvhdrMstparamDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}