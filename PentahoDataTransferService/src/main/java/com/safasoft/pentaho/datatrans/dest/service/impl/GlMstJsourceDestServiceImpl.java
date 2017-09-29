package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstJsourceDest;
import com.safasoft.pentaho.datatrans.dest.dao.GlMstJsourceDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.GlMstJsourceDestService;

@Service("glMstJsourceDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class GlMstJsourceDestServiceImpl implements GlMstJsourceDestService {

  @Autowired
  private GlMstJsourceDestDAO glMstJsourceDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<GlMstJsourceDest> save(List<GlMstJsourceDest> domain, int bulkRecord) {
    return glMstJsourceDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return glMstJsourceDestDAO.truncateTable(tableName);
  }
}