package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvOutHdr;

public interface RinvOutHdrService {

  List<RinvOutHdr> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}