package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.ApplCoyarea;

public interface ApplCoyareaService {

  List<ApplCoyarea> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}