package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvOutDtlDest;

public interface RinvOutDtlDestService {

  List<RinvOutDtlDest> save(List<RinvOutDtlDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}