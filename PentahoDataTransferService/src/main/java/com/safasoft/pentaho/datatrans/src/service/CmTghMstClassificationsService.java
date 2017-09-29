package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstClassifications;

public interface CmTghMstClassificationsService {

  List<CmTghMstClassifications> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}