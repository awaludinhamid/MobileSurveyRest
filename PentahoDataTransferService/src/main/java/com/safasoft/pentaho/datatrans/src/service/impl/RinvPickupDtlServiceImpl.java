package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvPickupDtl;
import com.safasoft.pentaho.datatrans.src.dao.RinvPickupDtlDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvPickupDtlService;

@Service("rinvPickupDtlService")
@Transactional(readOnly=true)
public class RinvPickupDtlServiceImpl implements RinvPickupDtlService {

  @Autowired
  private RinvPickupDtlDAO rinvPickupDtlDAO;

  @Override
  public List<RinvPickupDtl> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvPickupDtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvPickupDtlDAO.count();
  }
}