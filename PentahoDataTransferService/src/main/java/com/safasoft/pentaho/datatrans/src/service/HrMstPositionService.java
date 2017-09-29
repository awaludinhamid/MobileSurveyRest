package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrMstPosition;

public interface HrMstPositionService {

  List<HrMstPosition> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}