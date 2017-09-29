package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiMemo;

public interface CfinTrnRiMemoService {

  List<CfinTrnRiMemo> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}