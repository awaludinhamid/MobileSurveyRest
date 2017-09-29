package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstRelationDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrMstRelationDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrMstRelationDestService;

@Service("hrMstRelationDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrMstRelationDestServiceImpl implements HrMstRelationDestService {

  @Autowired
  private HrMstRelationDestDAO hrMstRelationDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrMstRelationDest> save(List<HrMstRelationDest> domain, int bulkRecord) {
    return hrMstRelationDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrMstRelationDestDAO.truncateTable(tableName);
  }
}