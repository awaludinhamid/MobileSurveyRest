package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CollMstLocation;

public interface CollMstLocationService {

  List<CollMstLocation> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}