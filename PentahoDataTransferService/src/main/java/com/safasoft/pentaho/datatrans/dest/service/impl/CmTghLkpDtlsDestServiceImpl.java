package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghLkpDtlsDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghLkpDtlsDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghLkpDtlsDestService;

@Service("cmTghLkpDtlsDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghLkpDtlsDestServiceImpl implements CmTghLkpDtlsDestService {

  @Autowired
  private CmTghLkpDtlsDestDAO cmTghLkpDtlsDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghLkpDtlsDest> save(List<CmTghLkpDtlsDest> domain, int bulkRecord) {
    return cmTghLkpDtlsDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghLkpDtlsDestDAO.truncateTable(tableName);
  }
}