package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiLkriHdr;

public interface CfinTrnRiLkriHdrService {

  List<CfinTrnRiLkriHdr> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}