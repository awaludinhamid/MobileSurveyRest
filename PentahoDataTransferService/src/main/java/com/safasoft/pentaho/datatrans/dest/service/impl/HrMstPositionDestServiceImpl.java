package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstPositionDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrMstPositionDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrMstPositionDestService;

@Service("hrMstPositionDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrMstPositionDestServiceImpl implements HrMstPositionDestService {

  @Autowired
  private HrMstPositionDestDAO hrMstPositionDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrMstPositionDest> save(List<HrMstPositionDest> domain, int bulkRecord) {
    return hrMstPositionDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrMstPositionDestDAO.truncateTable(tableName);
  }
}