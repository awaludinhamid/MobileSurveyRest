package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghTrnVisitDtlDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghTrnVisitDtlDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghTrnVisitDtlDestService;

@Service("cmTghTrnVisitDtlDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghTrnVisitDtlDestServiceImpl implements CmTghTrnVisitDtlDestService {

  @Autowired
  private CmTghTrnVisitDtlDestDAO cmTghTrnVisitDtlDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghTrnVisitDtlDest> save(List<CmTghTrnVisitDtlDest> domain, int bulkRecord) {
    return cmTghTrnVisitDtlDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghTrnVisitDtlDestDAO.truncateTable(tableName);
  }
}