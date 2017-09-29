package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnOrderDest;

public interface CfinTrnOrderDestService {

  List<CfinTrnOrderDest> save(List<CfinTrnOrderDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}