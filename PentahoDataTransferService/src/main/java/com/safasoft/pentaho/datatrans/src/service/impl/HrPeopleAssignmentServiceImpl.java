package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrPeopleAssignment;
import com.safasoft.pentaho.datatrans.src.dao.HrPeopleAssignmentDAO;
import com.safasoft.pentaho.datatrans.src.service.HrPeopleAssignmentService;

@Service("hrPeopleAssignmentService")
@Transactional(readOnly=true)
public class HrPeopleAssignmentServiceImpl implements HrPeopleAssignmentService {

  @Autowired
  private HrPeopleAssignmentDAO hrPeopleAssignmentDAO;

  @Override
  public List<HrPeopleAssignment> getByPage(int pageNo, int numOfBulkRecord) {
    return hrPeopleAssignmentDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrPeopleAssignmentDAO.count();
  }
}