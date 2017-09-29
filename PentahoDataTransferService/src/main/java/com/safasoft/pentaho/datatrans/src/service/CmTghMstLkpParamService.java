package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstLkpParam;

public interface CmTghMstLkpParamService {

  List<CmTghMstLkpParam> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}