package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstCycles;

public interface CmTghMstCyclesService {

  List<CmTghMstCycles> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}