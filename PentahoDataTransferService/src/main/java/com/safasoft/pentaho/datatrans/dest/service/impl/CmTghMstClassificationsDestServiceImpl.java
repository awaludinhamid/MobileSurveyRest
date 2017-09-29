package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstClassificationsDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstClassificationsDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstClassificationsDestService;

@Service("cmTghMstClassificationsDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstClassificationsDestServiceImpl implements CmTghMstClassificationsDestService {

  @Autowired
  private CmTghMstClassificationsDestDAO cmTghMstClassificationsDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstClassificationsDest> save(List<CmTghMstClassificationsDest> domain, int bulkRecord) {
    return cmTghMstClassificationsDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstClassificationsDestDAO.truncateTable(tableName);
  }
}