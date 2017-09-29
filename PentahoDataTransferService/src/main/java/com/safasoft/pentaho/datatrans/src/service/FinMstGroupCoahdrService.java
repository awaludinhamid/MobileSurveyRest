package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinMstGroupCoahdr;

public interface FinMstGroupCoahdrService {

  List<FinMstGroupCoahdr> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}