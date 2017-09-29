package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.GlPeriod;

public interface GlPeriodService {

  List<GlPeriod> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}