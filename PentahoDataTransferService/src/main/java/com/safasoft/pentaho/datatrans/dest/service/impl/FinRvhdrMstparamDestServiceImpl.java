package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinRvhdrMstparamDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinRvhdrMstparamDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinRvhdrMstparamDestService;

@Service("finRvhdrMstparamDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinRvhdrMstparamDestServiceImpl implements FinRvhdrMstparamDestService {

  @Autowired
  private FinRvhdrMstparamDestDAO finRvhdrMstparamDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinRvhdrMstparamDest> save(List<FinRvhdrMstparamDest> domain, int bulkRecord) {
    return finRvhdrMstparamDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finRvhdrMstparamDestDAO.truncateTable(tableName);
  }
}