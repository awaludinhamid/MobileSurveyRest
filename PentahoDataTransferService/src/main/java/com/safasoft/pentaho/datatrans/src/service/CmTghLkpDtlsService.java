package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghLkpDtls;

public interface CmTghLkpDtlsService {

  List<CmTghLkpDtls> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}