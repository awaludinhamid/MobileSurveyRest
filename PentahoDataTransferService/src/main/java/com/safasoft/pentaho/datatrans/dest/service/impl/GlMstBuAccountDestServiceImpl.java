package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.GlMstBuAccountDest;
import com.safasoft.pentaho.datatrans.dest.dao.GlMstBuAccountDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.GlMstBuAccountDestService;

@Service("glMstBuAccountDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class GlMstBuAccountDestServiceImpl implements GlMstBuAccountDestService {

  @Autowired
  private GlMstBuAccountDestDAO glMstBuAccountDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<GlMstBuAccountDest> save(List<GlMstBuAccountDest> domain, int bulkRecord) {
    return glMstBuAccountDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return glMstBuAccountDestDAO.truncateTable(tableName);
  }
}