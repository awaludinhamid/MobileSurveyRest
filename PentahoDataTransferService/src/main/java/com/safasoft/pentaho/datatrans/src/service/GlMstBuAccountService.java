package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.GlMstBuAccount;

public interface GlMstBuAccountService {

  List<GlMstBuAccount> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}