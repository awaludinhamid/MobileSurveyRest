package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.RinvReceivedHdrDest;
import com.safasoft.pentaho.datatrans.dest.dao.RinvReceivedHdrDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.RinvReceivedHdrDestService;

@Service("rinvReceivedHdrDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class RinvReceivedHdrDestServiceImpl implements RinvReceivedHdrDestService {

  @Autowired
  private RinvReceivedHdrDestDAO rinvReceivedHdrDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<RinvReceivedHdrDest> save(List<RinvReceivedHdrDest> domain, int bulkRecord) {
    return rinvReceivedHdrDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return rinvReceivedHdrDestDAO.truncateTable(tableName);
  }
}