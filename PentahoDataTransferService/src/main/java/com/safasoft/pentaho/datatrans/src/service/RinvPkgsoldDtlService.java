package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvPkgsoldDtl;

public interface RinvPkgsoldDtlService {

  List<RinvPkgsoldDtl> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}