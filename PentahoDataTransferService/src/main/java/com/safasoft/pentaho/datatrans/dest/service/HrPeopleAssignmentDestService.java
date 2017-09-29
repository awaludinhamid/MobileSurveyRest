package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrPeopleAssignmentDest;

public interface HrPeopleAssignmentDestService {

  List<HrPeopleAssignmentDest> save(List<HrPeopleAssignmentDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}