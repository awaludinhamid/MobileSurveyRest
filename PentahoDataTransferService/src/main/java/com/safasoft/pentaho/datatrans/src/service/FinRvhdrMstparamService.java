package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinRvhdrMstparam;

public interface FinRvhdrMstparamService {

  List<FinRvhdrMstparam> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}