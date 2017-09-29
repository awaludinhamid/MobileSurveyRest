package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiMemoDest;

public interface CfinTrnRiMemoDestService {

  List<CfinTrnRiMemoDest> save(List<CfinTrnRiMemoDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}