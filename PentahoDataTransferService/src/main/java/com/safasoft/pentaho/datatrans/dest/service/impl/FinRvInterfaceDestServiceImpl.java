package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinRvInterfaceDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinRvInterfaceDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinRvInterfaceDestService;

@Service("finRvInterfaceDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinRvInterfaceDestServiceImpl implements FinRvInterfaceDestService {

  @Autowired
  private FinRvInterfaceDestDAO finRvInterfaceDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinRvInterfaceDest> save(List<FinRvInterfaceDest> domain, int bulkRecord) {
    return finRvInterfaceDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finRvInterfaceDestDAO.truncateTable(tableName);
  }
}