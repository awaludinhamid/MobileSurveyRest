package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinMstCardIssuer;

public interface FinMstCardIssuerService {

  List<FinMstCardIssuer> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}