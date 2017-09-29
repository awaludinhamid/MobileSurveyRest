package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghTrnVisitHdr;

public interface CmTghTrnVisitHdrService {

  List<CmTghTrnVisitHdr> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}