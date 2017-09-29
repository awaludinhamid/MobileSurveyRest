package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstDelqReasons;

public interface CmTghMstDelqReasonsService {

  List<CmTghMstDelqReasons> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}