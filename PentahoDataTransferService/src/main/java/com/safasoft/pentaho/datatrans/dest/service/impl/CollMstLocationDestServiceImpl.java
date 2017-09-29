package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CollMstLocationDest;
import com.safasoft.pentaho.datatrans.dest.dao.CollMstLocationDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CollMstLocationDestService;

@Service("collMstLocationDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CollMstLocationDestServiceImpl implements CollMstLocationDestService {

  @Autowired
  private CollMstLocationDestDAO collMstLocationDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CollMstLocationDest> save(List<CollMstLocationDest> domain, int bulkRecord) {
    return collMstLocationDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return collMstLocationDestDAO.truncateTable(tableName);
  }
}