package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstMatrixDest;

public interface CmTghMstMatrixDestService {

  List<CmTghMstMatrixDest> save(List<CmTghMstMatrixDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}