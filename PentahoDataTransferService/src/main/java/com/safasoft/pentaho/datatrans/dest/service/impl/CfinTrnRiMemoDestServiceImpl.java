package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiMemoDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTrnRiMemoDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiMemoDestService;

@Service("cfinTrnRiMemoDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTrnRiMemoDestServiceImpl implements CfinTrnRiMemoDestService {

  @Autowired
  private CfinTrnRiMemoDestDAO cfinTrnRiMemoDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTrnRiMemoDest> save(List<CfinTrnRiMemoDest> domain, int bulkRecord) {
    return cfinTrnRiMemoDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTrnRiMemoDestDAO.truncateTable(tableName);
  }
}