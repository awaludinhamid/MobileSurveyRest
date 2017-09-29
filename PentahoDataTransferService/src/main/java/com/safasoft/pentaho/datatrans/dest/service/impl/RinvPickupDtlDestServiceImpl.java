package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPickupDtlDest;
import com.safasoft.pentaho.datatrans.dest.dao.RinvPickupDtlDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.RinvPickupDtlDestService;

@Service("rinvPickupDtlDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class RinvPickupDtlDestServiceImpl implements RinvPickupDtlDestService {

  @Autowired
  private RinvPickupDtlDestDAO rinvPickupDtlDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<RinvPickupDtlDest> save(List<RinvPickupDtlDest> domain, int bulkRecord) {
    return rinvPickupDtlDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return rinvPickupDtlDestDAO.truncateTable(tableName);
  }
}