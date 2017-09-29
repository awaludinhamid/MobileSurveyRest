package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstCardAccountDest;

public interface FinMstCardAccountDestService {

  List<FinMstCardAccountDest> save(List<FinMstCardAccountDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}