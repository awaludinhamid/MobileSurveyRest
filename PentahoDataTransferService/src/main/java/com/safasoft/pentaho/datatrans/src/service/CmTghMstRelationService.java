package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstRelation;

public interface CmTghMstRelationService {

  List<CmTghMstRelation> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}