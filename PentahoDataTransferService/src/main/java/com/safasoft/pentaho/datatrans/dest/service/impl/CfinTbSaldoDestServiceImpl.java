package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTbSaldoDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTbSaldoDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTbSaldoDestService;

@Service("cfinTbSaldoDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTbSaldoDestServiceImpl implements CfinTbSaldoDestService {

  @Autowired
  private CfinTbSaldoDestDAO cfinTbSaldoDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTbSaldoDest> save(List<CfinTbSaldoDest> domain, int bulkRecord) {
    return cfinTbSaldoDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTbSaldoDestDAO.truncateTable(tableName);
  }
}