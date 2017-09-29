package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnContractsDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTrnContractsDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnContractsDestService;

@Service("cfinTrnContractsDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTrnContractsDestServiceImpl implements CfinTrnContractsDestService {

  @Autowired
  private CfinTrnContractsDestDAO cfinTrnContractsDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTrnContractsDest> save(List<CfinTrnContractsDest> domain, int bulkRecord) {
    return cfinTrnContractsDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTrnContractsDestDAO.truncateTable(tableName);
  }
}