package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghTrnVisitHdrDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghTrnVisitHdrDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghTrnVisitHdrDestService;

@Service("cmTghTrnVisitHdrDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghTrnVisitHdrDestServiceImpl implements CmTghTrnVisitHdrDestService {

  @Autowired
  private CmTghTrnVisitHdrDestDAO cmTghTrnVisitHdrDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghTrnVisitHdrDest> save(List<CmTghTrnVisitHdrDest> domain, int bulkRecord) {
    return cmTghTrnVisitHdrDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghTrnVisitHdrDestDAO.truncateTable(tableName);
  }
}