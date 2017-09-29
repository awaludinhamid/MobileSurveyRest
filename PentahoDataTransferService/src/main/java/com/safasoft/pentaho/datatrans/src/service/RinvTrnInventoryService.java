package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.RinvTrnInventory;

public interface RinvTrnInventoryService {

  List<RinvTrnInventory> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}