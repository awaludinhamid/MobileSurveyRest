package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTermination;

public interface CfinTerminationService {

  List<CfinTermination> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}