package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiLkriDtl;

public interface CfinTrnRiLkriDtlService {

  List<CfinTrnRiLkriDtl> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}