package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinTrnOrderDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinTrnOrderDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinTrnOrderDestService;

@Service("cfinTrnOrderDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinTrnOrderDestServiceImpl implements CfinTrnOrderDestService {

  @Autowired
  private CfinTrnOrderDestDAO cfinTrnOrderDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CfinTrnOrderDest> save(List<CfinTrnOrderDest> domain, int bulkRecord) {
    return cfinTrnOrderDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cfinTrnOrderDestDAO.truncateTable(tableName);
  }
}