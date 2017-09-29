package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinInvhdrMstparam;

public interface FinInvhdrMstparamService {

  List<FinInvhdrMstparam> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}