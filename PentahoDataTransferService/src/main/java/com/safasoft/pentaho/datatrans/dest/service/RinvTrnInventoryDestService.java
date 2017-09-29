package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvTrnInventoryDest;

public interface RinvTrnInventoryDestService {

  List<RinvTrnInventoryDest> save(List<RinvTrnInventoryDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}