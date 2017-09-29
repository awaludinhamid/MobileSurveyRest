package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstCardIssuerDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinMstCardIssuerDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinMstCardIssuerDestService;

@Service("finMstCardIssuerDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinMstCardIssuerDestServiceImpl implements FinMstCardIssuerDestService {

  @Autowired
  private FinMstCardIssuerDestDAO finMstCardIssuerDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinMstCardIssuerDest> save(List<FinMstCardIssuerDest> domain, int bulkRecord) {
    return finMstCardIssuerDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finMstCardIssuerDestDAO.truncateTable(tableName);
  }
}