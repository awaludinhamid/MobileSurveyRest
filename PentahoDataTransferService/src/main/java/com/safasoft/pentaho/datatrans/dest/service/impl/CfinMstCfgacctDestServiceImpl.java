package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstCfgacctDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinMstCfgacctDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstCfgacctDestService;

@Service("cfinMstCfgacctDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinMstCfgacctDestServiceImpl implements CfinMstCfgacctDestService {

  @Autowired
  private CfinMstCfgacctDestDAO cfinMstCfgacctDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinMstCfgacctDest> save(List<CfinMstCfgacctDest> domain, int bulkRecord) {
    return cfinMstCfgacctDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinMstCfgacctDestDAO.truncateTable(tableName);
  }
}