package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstJsourceDest;

public interface GlMstJsourceDestService {

  List<GlMstJsourceDest> save(List<GlMstJsourceDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}