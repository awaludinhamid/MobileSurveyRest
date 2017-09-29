package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvPkgsoldHdr;

public interface RinvPkgsoldHdrService {

  List<RinvPkgsoldHdr> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}