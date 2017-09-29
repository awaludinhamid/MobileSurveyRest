package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvReceivedDtl;

public interface RinvReceivedDtlService {

  List<RinvReceivedDtl> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}