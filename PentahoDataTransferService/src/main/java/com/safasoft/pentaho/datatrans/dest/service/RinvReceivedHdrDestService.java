package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvReceivedHdrDest;

public interface RinvReceivedHdrDestService {

  List<RinvReceivedHdrDest> save(List<RinvReceivedHdrDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}