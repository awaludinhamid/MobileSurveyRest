package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.RinvOutHdrDest;
import com.safasoft.pentaho.datatrans.dest.dao.RinvOutHdrDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.RinvOutHdrDestService;

@Service("rinvOutHdrDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class RinvOutHdrDestServiceImpl implements RinvOutHdrDestService {

  @Autowired
  private RinvOutHdrDestDAO rinvOutHdrDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<RinvOutHdrDest> save(List<RinvOutHdrDest> domain, int bulkRecord) {
    return rinvOutHdrDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return rinvOutHdrDestDAO.truncateTable(tableName);
  }
}