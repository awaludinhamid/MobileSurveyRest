package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiContractDest;

public interface CfinTrnRiContractDestService {

  List<CfinTrnRiContractDest> save(List<CfinTrnRiContractDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}