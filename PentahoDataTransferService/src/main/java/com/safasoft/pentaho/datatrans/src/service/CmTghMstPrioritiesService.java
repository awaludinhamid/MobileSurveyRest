package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPriorities;

public interface CmTghMstPrioritiesService {

  List<CmTghMstPriorities> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}