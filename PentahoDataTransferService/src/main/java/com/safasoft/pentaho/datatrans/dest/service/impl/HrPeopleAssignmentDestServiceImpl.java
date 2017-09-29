package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrPeopleAssignmentDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrPeopleAssignmentDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrPeopleAssignmentDestService;

@Service("hrPeopleAssignmentDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrPeopleAssignmentDestServiceImpl implements HrPeopleAssignmentDestService {

  @Autowired
  private HrPeopleAssignmentDestDAO hrPeopleAssignmentDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrPeopleAssignmentDest> save(List<HrPeopleAssignmentDest> domain, int bulkRecord) {
    return hrPeopleAssignmentDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrPeopleAssignmentDestDAO.truncateTable(tableName);
  }
}