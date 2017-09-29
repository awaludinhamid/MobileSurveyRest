package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstJobDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrMstJobDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrMstJobDestService;

@Service("hrMstJobDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrMstJobDestServiceImpl implements HrMstJobDestService {

  @Autowired
  private HrMstJobDestDAO hrMstJobDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrMstJobDest> save(List<HrMstJobDest> domain, int bulkRecord) {
    return hrMstJobDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrMstJobDestDAO.truncateTable(tableName);
  }
}