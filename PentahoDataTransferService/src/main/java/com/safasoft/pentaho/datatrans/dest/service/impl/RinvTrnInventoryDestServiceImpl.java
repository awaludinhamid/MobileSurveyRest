package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.RinvTrnInventoryDest;
import com.safasoft.pentaho.datatrans.dest.dao.RinvTrnInventoryDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.RinvTrnInventoryDestService;

@Service("rinvTrnInventoryDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class RinvTrnInventoryDestServiceImpl implements RinvTrnInventoryDestService {

  @Autowired
  private RinvTrnInventoryDestDAO rinvTrnInventoryDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<RinvTrnInventoryDest> save(List<RinvTrnInventoryDest> domain, int bulkRecord) {
    return rinvTrnInventoryDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return rinvTrnInventoryDestDAO.truncateTable(tableName);
  }
}