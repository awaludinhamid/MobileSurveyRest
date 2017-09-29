package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPitstop;

public interface CmTghMstPitstopService {

  List<CmTghMstPitstop> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}