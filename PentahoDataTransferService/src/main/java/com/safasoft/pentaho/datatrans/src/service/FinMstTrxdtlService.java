package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinMstTrxdtl;

public interface FinMstTrxdtlService {

  List<FinMstTrxdtl> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}