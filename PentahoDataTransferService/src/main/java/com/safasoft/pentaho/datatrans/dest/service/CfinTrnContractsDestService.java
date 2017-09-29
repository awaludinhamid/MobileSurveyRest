package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnContractsDest;

public interface CfinTrnContractsDestService {

  List<CfinTrnContractsDest> save(List<CfinTrnContractsDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}