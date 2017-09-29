package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstAreaSpv;

public interface CmTghMstAreaSpvService {

  List<CmTghMstAreaSpv> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}