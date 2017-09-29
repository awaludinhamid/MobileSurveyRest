package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTbSaldoDest;

public interface CfinTbSaldoDestService {

  List<CfinTbSaldoDest> save(List<CfinTbSaldoDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}