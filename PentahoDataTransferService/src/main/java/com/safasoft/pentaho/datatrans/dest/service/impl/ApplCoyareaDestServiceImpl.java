package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplCoyareaDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplCoyareaDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplCoyareaDestService;

@Service("applCoyareaDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplCoyareaDestServiceImpl implements ApplCoyareaDestService {

  @Autowired
  private ApplCoyareaDestDAO applCoyareaDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<ApplCoyareaDest> save(List<ApplCoyareaDest> domain, int bulkRecord) {
    return applCoyareaDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return applCoyareaDestDAO.truncateTable(tableName);
  }
}