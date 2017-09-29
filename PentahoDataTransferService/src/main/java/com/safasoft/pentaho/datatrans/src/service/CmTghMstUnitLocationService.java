package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstUnitLocation;

public interface CmTghMstUnitLocationService {

  List<CmTghMstUnitLocation> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}