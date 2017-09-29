package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPitstopDest;

public interface CmTghMstPitstopDestService {

  List<CmTghMstPitstopDest> save(List<CmTghMstPitstopDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}