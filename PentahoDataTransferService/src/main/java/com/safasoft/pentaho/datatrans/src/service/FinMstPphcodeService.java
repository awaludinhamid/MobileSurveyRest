package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinMstPphcode;

public interface FinMstPphcodeService {

  List<FinMstPphcode> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}