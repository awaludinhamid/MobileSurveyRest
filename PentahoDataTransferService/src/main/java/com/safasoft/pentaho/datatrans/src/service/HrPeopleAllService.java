package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrPeopleAll;

public interface HrPeopleAllService {

  List<HrPeopleAll> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}