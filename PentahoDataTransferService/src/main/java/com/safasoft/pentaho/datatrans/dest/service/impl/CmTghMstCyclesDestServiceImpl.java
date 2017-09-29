package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstCyclesDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstCyclesDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstCyclesDestService;

@Service("cmTghMstCyclesDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstCyclesDestServiceImpl implements CmTghMstCyclesDestService {

  @Autowired
  private CmTghMstCyclesDestDAO cmTghMstCyclesDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstCyclesDest> save(List<CmTghMstCyclesDest> domain, int bulkRecord) {
    return cmTghMstCyclesDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstCyclesDestDAO.truncateTable(tableName);
  }
}