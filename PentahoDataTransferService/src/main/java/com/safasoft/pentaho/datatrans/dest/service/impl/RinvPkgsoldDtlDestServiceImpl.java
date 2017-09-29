package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPkgsoldDtlDest;
import com.safasoft.pentaho.datatrans.dest.dao.RinvPkgsoldDtlDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.RinvPkgsoldDtlDestService;

@Service("rinvPkgsoldDtlDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class RinvPkgsoldDtlDestServiceImpl implements RinvPkgsoldDtlDestService {

  @Autowired
  private RinvPkgsoldDtlDestDAO rinvPkgsoldDtlDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<RinvPkgsoldDtlDest> save(List<RinvPkgsoldDtlDest> domain, int bulkRecord) {
    return rinvPkgsoldDtlDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return rinvPkgsoldDtlDestDAO.truncateTable(tableName);
  }
}