package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstorgTypeDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrMstorgTypeDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrMstorgTypeDestService;

@Service("hrMstorgTypeDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrMstorgTypeDestServiceImpl implements HrMstorgTypeDestService {

  @Autowired
  private HrMstorgTypeDestDAO hrMstorgTypeDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrMstorgTypeDest> save(List<HrMstorgTypeDest> domain, int bulkRecord) {
    return hrMstorgTypeDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrMstorgTypeDestDAO.truncateTable(tableName);
  }
}