package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstSomationTypeDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstSomationTypeDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstSomationTypeDestService;

@Service("cmTghMstSomationTypeDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstSomationTypeDestServiceImpl implements CmTghMstSomationTypeDestService {

  @Autowired
  private CmTghMstSomationTypeDestDAO cmTghMstSomationTypeDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstSomationTypeDest> save(List<CmTghMstSomationTypeDest> domain, int bulkRecord) {
    return cmTghMstSomationTypeDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstSomationTypeDestDAO.truncateTable(tableName);
  }
}