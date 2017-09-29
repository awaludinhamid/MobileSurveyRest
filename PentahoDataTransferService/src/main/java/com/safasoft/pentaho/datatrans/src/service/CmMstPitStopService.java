package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmMstPitStop;

public interface CmMstPitStopService {

  List<CmMstPitStop> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}