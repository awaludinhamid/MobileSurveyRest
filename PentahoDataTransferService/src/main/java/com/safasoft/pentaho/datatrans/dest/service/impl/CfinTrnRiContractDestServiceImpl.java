package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiContractDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTrnRiContractDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiContractDestService;

@Service("cfinTrnRiContractDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTrnRiContractDestServiceImpl implements CfinTrnRiContractDestService {

  @Autowired
  private CfinTrnRiContractDestDAO cfinTrnRiContractDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTrnRiContractDest> save(List<CfinTrnRiContractDest> domain, int bulkRecord) {
    return cfinTrnRiContractDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTrnRiContractDestDAO.truncateTable(tableName);
  }
}