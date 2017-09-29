package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstLkpParamDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstLkpParamDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstLkpParamDestService;

@Service("cmTghMstLkpParamDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstLkpParamDestServiceImpl implements CmTghMstLkpParamDestService {

  @Autowired
  private CmTghMstLkpParamDestDAO cmTghMstLkpParamDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstLkpParamDest> save(List<CmTghMstLkpParamDest> domain, int bulkRecord) {
    return cmTghMstLkpParamDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstLkpParamDestDAO.truncateTable(tableName);
  }
}