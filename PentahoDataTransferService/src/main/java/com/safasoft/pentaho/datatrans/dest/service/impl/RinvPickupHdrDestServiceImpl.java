package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.RinvPickupHdrDest;
import com.safasoft.pentaho.datatrans.dest.dao.RinvPickupHdrDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.RinvPickupHdrDestService;

@Service("rinvPickupHdrDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class RinvPickupHdrDestServiceImpl implements RinvPickupHdrDestService {

  @Autowired
  private RinvPickupHdrDestDAO rinvPickupHdrDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<RinvPickupHdrDest> save(List<RinvPickupHdrDest> domain, int bulkRecord) {
    return rinvPickupHdrDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return rinvPickupHdrDestDAO.truncateTable(tableName);
  }
}