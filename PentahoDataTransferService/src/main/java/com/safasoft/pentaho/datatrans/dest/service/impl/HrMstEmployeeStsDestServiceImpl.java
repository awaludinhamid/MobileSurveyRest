package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstEmployeeStsDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrMstEmployeeStsDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrMstEmployeeStsDestService;

@Service("hrMstEmployeeStsDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrMstEmployeeStsDestServiceImpl implements HrMstEmployeeStsDestService {

  @Autowired
  private HrMstEmployeeStsDestDAO hrMstEmployeeStsDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrMstEmployeeStsDest> save(List<HrMstEmployeeStsDest> domain, int bulkRecord) {
    return hrMstEmployeeStsDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrMstEmployeeStsDestDAO.truncateTable(tableName);
  }
}