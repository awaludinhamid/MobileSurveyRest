package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstUnitLocationDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstUnitLocationDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstUnitLocationDestService;

@Service("cmTghMstUnitLocationDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstUnitLocationDestServiceImpl implements CmTghMstUnitLocationDestService {

  @Autowired
  private CmTghMstUnitLocationDestDAO cmTghMstUnitLocationDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstUnitLocationDest> save(List<CmTghMstUnitLocationDest> domain, int bulkRecord) {
    return cmTghMstUnitLocationDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstUnitLocationDestDAO.truncateTable(tableName);
  }
}