package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiContract;

public interface CfinTrnRiContractService {

  List<CfinTrnRiContract> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}