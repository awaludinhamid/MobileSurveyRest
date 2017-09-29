package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstSomationTypeDest;

public interface CmTghMstSomationTypeDestService {

  List<CmTghMstSomationTypeDest> save(List<CmTghMstSomationTypeDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}