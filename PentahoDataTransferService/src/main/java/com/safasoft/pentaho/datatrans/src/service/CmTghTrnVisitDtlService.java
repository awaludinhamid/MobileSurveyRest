package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghTrnVisitDtl;

public interface CmTghTrnVisitDtlService {

  List<CmTghTrnVisitDtl> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}