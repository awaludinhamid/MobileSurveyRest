package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.RinvReceivedDtlDest;
import com.safasoft.pentaho.datatrans.dest.dao.RinvReceivedDtlDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.RinvReceivedDtlDestService;

@Service("rinvReceivedDtlDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class RinvReceivedDtlDestServiceImpl implements RinvReceivedDtlDestService {

  @Autowired
  private RinvReceivedDtlDestDAO rinvReceivedDtlDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<RinvReceivedDtlDest> save(List<RinvReceivedDtlDest> domain, int bulkRecord) {
    return rinvReceivedDtlDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return rinvReceivedDtlDestDAO.truncateTable(tableName);
  }
}