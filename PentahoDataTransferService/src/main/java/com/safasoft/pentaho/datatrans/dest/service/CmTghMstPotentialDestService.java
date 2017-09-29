package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPotentialDest;

public interface CmTghMstPotentialDestService {

  List<CmTghMstPotentialDest> save(List<CmTghMstPotentialDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}