package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPrioritiesDest;

public interface CmTghMstPrioritiesDestService {

  List<CmTghMstPrioritiesDest> save(List<CmTghMstPrioritiesDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}