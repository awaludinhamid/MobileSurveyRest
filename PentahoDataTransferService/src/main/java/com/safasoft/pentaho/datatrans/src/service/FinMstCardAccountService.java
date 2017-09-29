package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinMstCardAccount;

public interface FinMstCardAccountService {

  List<FinMstCardAccount> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}