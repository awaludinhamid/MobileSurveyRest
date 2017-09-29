package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstDelqReasonsDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstDelqReasonsDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstDelqReasonsDestService;

@Service("cmTghMstDelqReasonsDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstDelqReasonsDestServiceImpl implements CmTghMstDelqReasonsDestService {

  @Autowired
  private CmTghMstDelqReasonsDestDAO cmTghMstDelqReasonsDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstDelqReasonsDest> save(List<CmTghMstDelqReasonsDest> domain, int bulkRecord) {
    return cmTghMstDelqReasonsDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstDelqReasonsDestDAO.truncateTable(tableName);
  }
}