package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstBuAccountDest;

public interface GlMstBuAccountDestService {

  List<GlMstBuAccountDest> save(List<GlMstBuAccountDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}