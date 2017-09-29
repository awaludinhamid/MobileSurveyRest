package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghLkpHdrsDest;

public interface CmTghLkpHdrsDestService {

  List<CmTghLkpHdrsDest> save(List<CmTghLkpHdrsDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}