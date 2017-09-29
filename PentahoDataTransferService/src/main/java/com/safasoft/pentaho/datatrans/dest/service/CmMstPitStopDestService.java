package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CmMstPitStopDest;

public interface CmMstPitStopDestService {

  List<CmMstPitStopDest> save(List<CmMstPitStopDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}