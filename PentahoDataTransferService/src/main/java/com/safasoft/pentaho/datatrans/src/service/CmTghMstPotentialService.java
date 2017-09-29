package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPotential;

public interface CmTghMstPotentialService {

  List<CmTghMstPotential> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}