package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiRepayHistoryDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTrnRiRepayHistoryDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiRepayHistoryDestService;

@Service("cfinTrnRiRepayHistoryDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTrnRiRepayHistoryDestServiceImpl implements CfinTrnRiRepayHistoryDestService {

  @Autowired
  private CfinTrnRiRepayHistoryDestDAO cfinTrnRiRepayHistoryDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTrnRiRepayHistoryDest> save(List<CfinTrnRiRepayHistoryDest> domain, int bulkRecord) {
    return cfinTrnRiRepayHistoryDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTrnRiRepayHistoryDestDAO.truncateTable(tableName);
  }
}