package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTerminationDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTerminationDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTerminationDestService;

@Service("cfinTerminationDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTerminationDestServiceImpl implements CfinTerminationDestService {

  @Autowired
  private CfinTerminationDestDAO cfinTerminationDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTerminationDest> save(List<CfinTerminationDest> domain, int bulkRecord) {
    return cfinTerminationDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTerminationDestDAO.truncateTable(tableName);
  }
}