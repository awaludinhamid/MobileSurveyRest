package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstRelationDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstRelationDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstRelationDestService;

@Service("cmTghMstRelationDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstRelationDestServiceImpl implements CmTghMstRelationDestService {

  @Autowired
  private CmTghMstRelationDestDAO cmTghMstRelationDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstRelationDest> save(List<CmTghMstRelationDest> domain, int bulkRecord) {
    return cmTghMstRelationDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstRelationDestDAO.truncateTable(tableName);
  }
}