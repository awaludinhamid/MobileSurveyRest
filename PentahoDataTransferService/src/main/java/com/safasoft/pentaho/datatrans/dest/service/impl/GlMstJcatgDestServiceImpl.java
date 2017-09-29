package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstJcatgDest;
import com.safasoft.pentaho.datatrans.dest.dao.GlMstJcatgDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.GlMstJcatgDestService;

@Service("glMstJcatgDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class GlMstJcatgDestServiceImpl implements GlMstJcatgDestService {

  @Autowired
  private GlMstJcatgDestDAO glMstJcatgDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<GlMstJcatgDest> save(List<GlMstJcatgDest> domain, int bulkRecord) {
    return glMstJcatgDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return glMstJcatgDestDAO.truncateTable(tableName);
  }
}