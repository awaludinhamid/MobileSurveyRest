package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinTrncashBalance;

public interface FinTrncashBalanceService {

  List<FinTrncashBalance> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}