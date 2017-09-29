package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPrioritiesDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstPrioritiesDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstPrioritiesDestService;

@Service("cmTghMstPrioritiesDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstPrioritiesDestServiceImpl implements CmTghMstPrioritiesDestService {

  @Autowired
  private CmTghMstPrioritiesDestDAO cmTghMstPrioritiesDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstPrioritiesDest> save(List<CmTghMstPrioritiesDest> domain, int bulkRecord) {
    return cmTghMstPrioritiesDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstPrioritiesDestDAO.truncateTable(tableName);
  }
}