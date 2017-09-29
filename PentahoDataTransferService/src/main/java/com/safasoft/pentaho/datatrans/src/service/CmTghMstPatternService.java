package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPattern;

public interface CmTghMstPatternService {

  List<CmTghMstPattern> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}