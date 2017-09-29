package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnContracts;

public interface CfinTrnContractsService {

  List<CfinTrnContracts> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}