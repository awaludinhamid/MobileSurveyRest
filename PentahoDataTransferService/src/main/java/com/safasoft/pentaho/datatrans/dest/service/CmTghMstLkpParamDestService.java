package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstLkpParamDest;

public interface CmTghMstLkpParamDestService {

  List<CmTghMstLkpParamDest> save(List<CmTghMstLkpParamDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}