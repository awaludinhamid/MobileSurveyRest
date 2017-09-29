package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstGroupCoahdrDest;

public interface FinMstGroupCoahdrDestService {

  List<FinMstGroupCoahdrDest> save(List<FinMstGroupCoahdrDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}