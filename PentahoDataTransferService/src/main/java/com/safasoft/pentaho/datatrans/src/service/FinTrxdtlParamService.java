package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinTrxdtlParam;

public interface FinTrxdtlParamService {

  List<FinTrxdtlParam> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}