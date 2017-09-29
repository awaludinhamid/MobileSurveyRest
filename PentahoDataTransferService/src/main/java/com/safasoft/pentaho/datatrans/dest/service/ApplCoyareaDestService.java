package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyareaDest;

public interface ApplCoyareaDestService {

  List<ApplCoyareaDest> save(List<ApplCoyareaDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}