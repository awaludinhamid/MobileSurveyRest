package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPickupDtlDest;

public interface RinvPickupDtlDestService {

  List<RinvPickupDtlDest> save(List<RinvPickupDtlDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}