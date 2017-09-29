package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.GlPeriodDest;

public interface GlPeriodDestService {

  List<GlPeriodDest> save(List<GlPeriodDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}