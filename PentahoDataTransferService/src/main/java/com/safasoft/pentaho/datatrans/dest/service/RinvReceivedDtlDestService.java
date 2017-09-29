package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvReceivedDtlDest;

public interface RinvReceivedDtlDestService {

  List<RinvReceivedDtlDest> save(List<RinvReceivedDtlDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}