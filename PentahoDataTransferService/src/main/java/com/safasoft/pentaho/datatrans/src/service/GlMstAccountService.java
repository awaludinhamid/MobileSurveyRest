package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.GlMstAccount;

public interface GlMstAccountService {

  List<GlMstAccount> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}