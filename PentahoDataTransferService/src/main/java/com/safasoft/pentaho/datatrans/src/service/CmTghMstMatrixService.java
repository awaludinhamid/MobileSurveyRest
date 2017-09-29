package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstMatrix;

public interface CmTghMstMatrixService {

  List<CmTghMstMatrix> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}