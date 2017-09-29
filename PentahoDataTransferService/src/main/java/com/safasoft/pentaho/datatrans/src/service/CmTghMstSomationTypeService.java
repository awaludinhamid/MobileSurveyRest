package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstSomationType;

public interface CmTghMstSomationTypeService {

  List<CmTghMstSomationType> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}