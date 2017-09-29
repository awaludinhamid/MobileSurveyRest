package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvReceivedHdr;

public interface RinvReceivedHdrService {

  List<RinvReceivedHdr> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}