package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinTrncashBalanceDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinTrncashBalanceDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinTrncashBalanceDestService;

@Service("finTrncashBalanceDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinTrncashBalanceDestServiceImpl implements FinTrncashBalanceDestService {

  @Autowired
  private FinTrncashBalanceDestDAO finTrncashBalanceDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinTrncashBalanceDest> save(List<FinTrncashBalanceDest> domain, int bulkRecord) {
    return finTrncashBalanceDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finTrncashBalanceDestDAO.truncateTable(tableName);
  }
}