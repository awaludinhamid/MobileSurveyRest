package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinInvhdrMstparamDest;

public interface FinInvhdrMstparamDestService {

  List<FinInvhdrMstparamDest> save(List<FinInvhdrMstparamDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}