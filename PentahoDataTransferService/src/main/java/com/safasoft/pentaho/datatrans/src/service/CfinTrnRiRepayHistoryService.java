package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiRepayHistory;

public interface CfinTrnRiRepayHistoryService {

  List<CfinTrnRiRepayHistory> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}