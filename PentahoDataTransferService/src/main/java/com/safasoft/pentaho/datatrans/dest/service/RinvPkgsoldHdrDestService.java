package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPkgsoldHdrDest;

public interface RinvPkgsoldHdrDestService {

  List<RinvPkgsoldHdrDest> save(List<RinvPkgsoldHdrDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}