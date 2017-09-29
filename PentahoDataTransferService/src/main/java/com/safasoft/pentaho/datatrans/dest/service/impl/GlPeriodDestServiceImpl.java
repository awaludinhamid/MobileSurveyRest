package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.GlPeriodDest;
import com.safasoft.pentaho.datatrans.dest.dao.GlPeriodDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.GlPeriodDestService;

@Service("glPeriodDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class GlPeriodDestServiceImpl implements GlPeriodDestService {

  @Autowired
  private GlPeriodDestDAO glPeriodDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<GlPeriodDest> save(List<GlPeriodDest> domain, int bulkRecord) {
    return glPeriodDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return glPeriodDestDAO.truncateTable(tableName);
  }
}