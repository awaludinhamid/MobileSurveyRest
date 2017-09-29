package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstAreaZonaDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstAreaZonaDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstAreaZonaDestService;

@Service("cmTghMstAreaZonaDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstAreaZonaDestServiceImpl implements CmTghMstAreaZonaDestService {

  @Autowired
  private CmTghMstAreaZonaDestDAO cmTghMstAreaZonaDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstAreaZonaDest> save(List<CmTghMstAreaZonaDest> domain, int bulkRecord) {
    return cmTghMstAreaZonaDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstAreaZonaDestDAO.truncateTable(tableName);
  }
}