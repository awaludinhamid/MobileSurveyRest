package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrMstJob;

public interface HrMstJobService {

  List<HrMstJob> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}