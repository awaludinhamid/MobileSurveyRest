package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvPickupDtl;

public interface RinvPickupDtlService {

  List<RinvPickupDtl> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}