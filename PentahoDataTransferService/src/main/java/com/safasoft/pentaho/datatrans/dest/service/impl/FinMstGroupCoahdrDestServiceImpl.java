package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstGroupCoahdrDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinMstGroupCoahdrDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinMstGroupCoahdrDestService;

@Service("finMstGroupCoahdrDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinMstGroupCoahdrDestServiceImpl implements FinMstGroupCoahdrDestService {

  @Autowired
  private FinMstGroupCoahdrDestDAO finMstGroupCoahdrDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinMstGroupCoahdrDest> save(List<FinMstGroupCoahdrDest> domain, int bulkRecord) {
    return finMstGroupCoahdrDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finMstGroupCoahdrDestDAO.truncateTable(tableName);
  }
}