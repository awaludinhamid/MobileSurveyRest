package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghLkpDtlsDest;

public interface CmTghLkpDtlsDestService {

  List<CmTghLkpDtlsDest> save(List<CmTghLkpDtlsDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}