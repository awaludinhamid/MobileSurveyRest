package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnOrder;

public interface CfinTrnOrderService {

  List<CfinTrnOrder> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}