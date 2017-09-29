package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnBtcaDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTrnBtcaDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnBtcaDestService;

@Service("cfinTrnBtcaDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTrnBtcaDestServiceImpl implements CfinTrnBtcaDestService {

  @Autowired
  private CfinTrnBtcaDestDAO cfinTrnBtcaDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTrnBtcaDest> save(List<CfinTrnBtcaDest> domain, int bulkRecord) {
    return cfinTrnBtcaDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTrnBtcaDestDAO.truncateTable(tableName);
  }
}