package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinTrxdtlParamDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinTrxdtlParamDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinTrxdtlParamDestService;

@Service("finTrxdtlParamDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinTrxdtlParamDestServiceImpl implements FinTrxdtlParamDestService {

  @Autowired
  private FinTrxdtlParamDestDAO finTrxdtlParamDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinTrxdtlParamDest> save(List<FinTrxdtlParamDest> domain, int bulkRecord) {
    return finTrxdtlParamDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finTrxdtlParamDestDAO.truncateTable(tableName);
  }
}