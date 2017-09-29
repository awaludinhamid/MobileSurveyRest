package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinTrnbankBalance;

public interface FinTrnbankBalanceService {

  List<FinTrnbankBalance> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}