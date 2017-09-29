package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstPositionDest;

public interface HrMstPositionDestService {

  List<HrMstPositionDest> save(List<HrMstPositionDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}