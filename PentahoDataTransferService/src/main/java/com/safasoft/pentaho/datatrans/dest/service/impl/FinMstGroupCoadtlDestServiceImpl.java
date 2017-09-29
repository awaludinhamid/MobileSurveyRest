package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstGroupCoadtlDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinMstGroupCoadtlDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinMstGroupCoadtlDestService;

@Service("finMstGroupCoadtlDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinMstGroupCoadtlDestServiceImpl implements FinMstGroupCoadtlDestService {

  @Autowired
  private FinMstGroupCoadtlDestDAO finMstGroupCoadtlDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinMstGroupCoadtlDest> save(List<FinMstGroupCoadtlDest> domain, int bulkRecord) {
    return finMstGroupCoadtlDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finMstGroupCoadtlDestDAO.truncateTable(tableName);
  }
}