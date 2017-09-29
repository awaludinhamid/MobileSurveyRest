package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghLkpHdrsDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghLkpHdrsDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghLkpHdrsDestService;

@Service("cmTghLkpHdrsDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghLkpHdrsDestServiceImpl implements CmTghLkpHdrsDestService {

  @Autowired
  private CmTghLkpHdrsDestDAO cmTghLkpHdrsDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghLkpHdrsDest> save(List<CmTghLkpHdrsDest> domain, int bulkRecord) {
    return cmTghLkpHdrsDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghLkpHdrsDestDAO.truncateTable(tableName);
  }
}