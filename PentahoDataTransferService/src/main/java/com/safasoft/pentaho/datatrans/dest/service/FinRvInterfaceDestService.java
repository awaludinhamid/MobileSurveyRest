package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinRvInterfaceDest;

public interface FinRvInterfaceDestService {

  List<FinRvInterfaceDest> save(List<FinRvInterfaceDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}