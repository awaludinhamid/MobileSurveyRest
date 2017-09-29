package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrDeptAllDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrDeptAllDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrDeptAllDestService;

@Service("hrDeptAllDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrDeptAllDestServiceImpl implements HrDeptAllDestService {

  @Autowired
  private HrDeptAllDestDAO hrDeptAllDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrDeptAllDest> save(List<HrDeptAllDest> domain, int bulkRecord) {
    return hrDeptAllDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrDeptAllDestDAO.truncateTable(tableName);
  }
}