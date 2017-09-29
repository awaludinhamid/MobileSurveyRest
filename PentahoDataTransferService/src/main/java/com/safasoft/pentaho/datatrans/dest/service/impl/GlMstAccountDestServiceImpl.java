package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstAccountDest;
import com.safasoft.pentaho.datatrans.dest.dao.GlMstAccountDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.GlMstAccountDestService;

@Service("glMstAccountDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class GlMstAccountDestServiceImpl implements GlMstAccountDestService {

  @Autowired
  private GlMstAccountDestDAO glMstAccountDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<GlMstAccountDest> save(List<GlMstAccountDest> domain, int bulkRecord) {
    return glMstAccountDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return glMstAccountDestDAO.truncateTable(tableName);
  }
}