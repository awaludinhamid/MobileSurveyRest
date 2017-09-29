package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstMatrixDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstMatrixDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstMatrixDestService;

@Service("cmTghMstMatrixDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstMatrixDestServiceImpl implements CmTghMstMatrixDestService {

  @Autowired
  private CmTghMstMatrixDestDAO cmTghMstMatrixDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstMatrixDest> save(List<CmTghMstMatrixDest> domain, int bulkRecord) {
    return cmTghMstMatrixDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstMatrixDestDAO.truncateTable(tableName);
  }
}