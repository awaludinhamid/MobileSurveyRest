package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvPickupHdr;

public interface RinvPickupHdrService {

  List<RinvPickupHdr> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}