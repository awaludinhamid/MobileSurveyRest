package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPkgsoldDtlDest;

public interface RinvPkgsoldDtlDestService {

  List<RinvPkgsoldDtlDest> save(List<RinvPkgsoldDtlDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}