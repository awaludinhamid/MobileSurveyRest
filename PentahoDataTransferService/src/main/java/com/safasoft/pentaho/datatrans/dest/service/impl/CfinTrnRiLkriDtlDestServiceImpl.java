package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiLkriDtlDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTrnRiLkriDtlDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiLkriDtlDestService;

@Service("cfinTrnRiLkriDtlDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTrnRiLkriDtlDestServiceImpl implements CfinTrnRiLkriDtlDestService {

  @Autowired
  private CfinTrnRiLkriDtlDestDAO cfinTrnRiLkriDtlDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTrnRiLkriDtlDest> save(List<CfinTrnRiLkriDtlDest> domain, int bulkRecord) {
    return cfinTrnRiLkriDtlDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTrnRiLkriDtlDestDAO.truncateTable(tableName);
  }
}