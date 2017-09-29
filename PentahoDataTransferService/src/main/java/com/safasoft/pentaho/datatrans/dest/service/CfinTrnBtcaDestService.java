package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnBtcaDest;

public interface CfinTrnBtcaDestService {

  List<CfinTrnBtcaDest> save(List<CfinTrnBtcaDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}