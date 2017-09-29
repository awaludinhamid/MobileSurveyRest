package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrMstorgType;

public interface HrMstorgTypeService {

  List<HrMstorgType> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}