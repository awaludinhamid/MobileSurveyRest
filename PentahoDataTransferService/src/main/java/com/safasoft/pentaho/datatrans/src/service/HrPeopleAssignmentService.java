package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrPeopleAssignment;

public interface HrPeopleAssignmentService {

  List<HrPeopleAssignment> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}