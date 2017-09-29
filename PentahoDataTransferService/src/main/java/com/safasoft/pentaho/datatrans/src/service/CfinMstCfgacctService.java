package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstCfgacct;

public interface CfinMstCfgacctService {

  List<CfinMstCfgacct> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}