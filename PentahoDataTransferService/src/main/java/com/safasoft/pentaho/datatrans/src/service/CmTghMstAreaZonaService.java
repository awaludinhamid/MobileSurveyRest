package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstAreaZona;

public interface CmTghMstAreaZonaService {

  List<CmTghMstAreaZona> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}