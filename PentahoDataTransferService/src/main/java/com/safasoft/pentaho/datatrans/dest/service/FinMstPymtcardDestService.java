package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstPymtcardDest;

public interface FinMstPymtcardDestService {

  List<FinMstPymtcardDest> save(List<FinMstPymtcardDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}