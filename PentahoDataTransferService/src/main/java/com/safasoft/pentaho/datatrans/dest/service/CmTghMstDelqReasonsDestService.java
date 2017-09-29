package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstDelqReasonsDest;

public interface CmTghMstDelqReasonsDestService {

  List<CmTghMstDelqReasonsDest> save(List<CmTghMstDelqReasonsDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}