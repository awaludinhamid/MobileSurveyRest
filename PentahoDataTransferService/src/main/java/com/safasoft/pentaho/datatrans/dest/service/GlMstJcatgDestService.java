package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstJcatgDest;

public interface GlMstJcatgDestService {

  List<GlMstJcatgDest> save(List<GlMstJcatgDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}