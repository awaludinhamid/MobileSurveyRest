package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CollMstLocationDest;

public interface CollMstLocationDestService {

  List<CollMstLocationDest> save(List<CollMstLocationDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}