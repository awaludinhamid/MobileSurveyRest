package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstTrxdtlDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinMstTrxdtlDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinMstTrxdtlDestService;

@Service("finMstTrxdtlDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinMstTrxdtlDestServiceImpl implements FinMstTrxdtlDestService {

  @Autowired
  private FinMstTrxdtlDestDAO finMstTrxdtlDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinMstTrxdtlDest> save(List<FinMstTrxdtlDest> domain, int bulkRecord) {
    return finMstTrxdtlDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finMstTrxdtlDestDAO.truncateTable(tableName);
  }
}