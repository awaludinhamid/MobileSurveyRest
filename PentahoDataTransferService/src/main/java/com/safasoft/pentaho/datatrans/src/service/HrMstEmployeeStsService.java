package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrMstEmployeeSts;

public interface HrMstEmployeeStsService {

  List<HrMstEmployeeSts> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}