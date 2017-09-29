package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinRvInterface;

public interface FinRvInterfaceService {

  List<FinRvInterface> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}