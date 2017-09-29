package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiLkriHdrDest;

public interface CfinTrnRiLkriHdrDestService {

  List<CfinTrnRiLkriHdrDest> save(List<CfinTrnRiLkriHdrDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}