package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrDeptAll;

public interface HrDeptAllService {

  List<HrDeptAll> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}