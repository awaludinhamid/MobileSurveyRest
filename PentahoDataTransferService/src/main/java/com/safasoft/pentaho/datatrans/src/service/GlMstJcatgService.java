package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.GlMstJcatg;

public interface GlMstJcatgService {

  List<GlMstJcatg> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}