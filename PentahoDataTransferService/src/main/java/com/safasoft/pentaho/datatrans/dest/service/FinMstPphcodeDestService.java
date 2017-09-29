package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstPphcodeDest;

public interface FinMstPphcodeDestService {

  List<FinMstPphcodeDest> save(List<FinMstPphcodeDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}