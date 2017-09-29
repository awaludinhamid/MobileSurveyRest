package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstMarketprog;

public interface ApplMstMarketprogService {

  List<ApplMstMarketprog> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}