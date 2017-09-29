package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnBtca;

public interface CfinTrnBtcaService {

  List<CfinTrnBtca> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}