package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstActionPlan;

public interface CmTghMstActionPlanService {

  List<CmTghMstActionPlan> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}