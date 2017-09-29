package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghLkpHdrs;

public interface CmTghLkpHdrsService {

  List<CmTghLkpHdrs> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}