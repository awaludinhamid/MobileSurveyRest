package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.GlMstJsource;

public interface GlMstJsourceService {

  List<GlMstJsource> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}