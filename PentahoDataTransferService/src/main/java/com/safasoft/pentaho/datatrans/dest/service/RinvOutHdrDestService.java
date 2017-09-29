package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvOutHdrDest;

public interface RinvOutHdrDestService {

  List<RinvOutHdrDest> save(List<RinvOutHdrDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}