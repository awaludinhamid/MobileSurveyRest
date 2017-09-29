package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstActionPlanDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstActionPlanDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstActionPlanDestService;

@Service("cmTghMstActionPlanDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstActionPlanDestServiceImpl implements CmTghMstActionPlanDestService {

  @Autowired
  private CmTghMstActionPlanDestDAO cmTghMstActionPlanDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstActionPlanDest> save(List<CmTghMstActionPlanDest> domain, int bulkRecord) {
    return cmTghMstActionPlanDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstActionPlanDestDAO.truncateTable(tableName);
  }
}