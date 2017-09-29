package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstCyclesDest;

public interface CmTghMstCyclesDestService {

  List<CmTghMstCyclesDest> save(List<CmTghMstCyclesDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}