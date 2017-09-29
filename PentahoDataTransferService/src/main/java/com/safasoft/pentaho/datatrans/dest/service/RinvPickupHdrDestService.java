package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPickupHdrDest;

public interface RinvPickupHdrDestService {

  List<RinvPickupHdrDest> save(List<RinvPickupHdrDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}