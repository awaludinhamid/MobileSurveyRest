package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrMstRelation;

public interface HrMstRelationService {

  List<HrMstRelation> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}