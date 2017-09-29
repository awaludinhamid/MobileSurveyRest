package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPkgsoldHdrDest;
import com.safasoft.pentaho.datatrans.dest.dao.RinvPkgsoldHdrDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.RinvPkgsoldHdrDestService;

@Service("rinvPkgsoldHdrDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class RinvPkgsoldHdrDestServiceImpl implements RinvPkgsoldHdrDestService {

  @Autowired
  private RinvPkgsoldHdrDestDAO rinvPkgsoldHdrDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<RinvPkgsoldHdrDest> save(List<RinvPkgsoldHdrDest> domain, int bulkRecord) {
    return rinvPkgsoldHdrDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return rinvPkgsoldHdrDestDAO.truncateTable(tableName);
  }
}