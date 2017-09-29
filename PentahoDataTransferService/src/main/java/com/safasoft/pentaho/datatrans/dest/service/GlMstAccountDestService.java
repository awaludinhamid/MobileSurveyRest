package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstAccountDest;

public interface GlMstAccountDestService {

  List<GlMstAccountDest> save(List<GlMstAccountDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}