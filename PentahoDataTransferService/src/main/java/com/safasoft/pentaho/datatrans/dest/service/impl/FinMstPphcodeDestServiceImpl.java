package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.FinMstPphcodeDest;
import com.safasoft.pentaho.datatrans.dest.dao.FinMstPphcodeDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.FinMstPphcodeDestService;

@Service("finMstPphcodeDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class FinMstPphcodeDestServiceImpl implements FinMstPphcodeDestService {

  @Autowired
  private FinMstPphcodeDestDAO finMstPphcodeDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<FinMstPphcodeDest> save(List<FinMstPphcodeDest> domain, int bulkRecord) {
    return finMstPphcodeDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return finMstPphcodeDestDAO.truncateTable(tableName);
  }
}