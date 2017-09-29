package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnRiLkriHdrDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTrnRiLkriHdrDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnRiLkriHdrDestService;

@Service("cfinTrnRiLkriHdrDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTrnRiLkriHdrDestServiceImpl implements CfinTrnRiLkriHdrDestService {

  @Autowired
  private CfinTrnRiLkriHdrDestDAO cfinTrnRiLkriHdrDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTrnRiLkriHdrDest> save(List<CfinTrnRiLkriHdrDest> domain, int bulkRecord) {
    return cfinTrnRiLkriHdrDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTrnRiLkriHdrDestDAO.truncateTable(tableName);
  }
}