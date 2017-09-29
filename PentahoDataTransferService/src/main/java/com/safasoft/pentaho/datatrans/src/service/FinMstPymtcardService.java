package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.FinMstPymtcard;

public interface FinMstPymtcardService {

  List<FinMstPymtcard> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}