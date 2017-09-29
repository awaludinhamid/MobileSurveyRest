package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstCardAccountDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinMstCardAccountDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinMstCardAccountDestService;

@Service("finMstCardAccountDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinMstCardAccountDestServiceImpl implements FinMstCardAccountDestService {

  @Autowired
  private FinMstCardAccountDestDAO finMstCardAccountDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinMstCardAccountDest> save(List<FinMstCardAccountDest> domain, int bulkRecord) {
    return finMstCardAccountDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finMstCardAccountDestDAO.truncateTable(tableName);
  }
}