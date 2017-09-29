package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinMstGroupCoadtl;

public interface FinMstGroupCoadtlService {

  List<FinMstGroupCoadtl> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}