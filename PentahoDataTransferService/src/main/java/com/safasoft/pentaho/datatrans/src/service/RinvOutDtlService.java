package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvOutDtl;

public interface RinvOutDtlService {

  List<RinvOutDtl> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}
