package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrPeopleAllDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrPeopleAllDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrPeopleAllDestService;

@Service("hrPeopleAllDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrPeopleAllDestServiceImpl implements HrPeopleAllDestService {

  @Autowired
  private HrPeopleAllDestDAO hrPeopleAllDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrPeopleAllDest> save(List<HrPeopleAllDest> domain, int bulkRecord) {
    return hrPeopleAllDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrPeopleAllDestDAO.truncateTable(tableName);
  }
}