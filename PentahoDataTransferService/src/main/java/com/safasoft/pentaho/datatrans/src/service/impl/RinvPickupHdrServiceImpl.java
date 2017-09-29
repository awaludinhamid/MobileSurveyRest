package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvPickupHdr;
import com.safasoft.pentaho.datatrans.src.dao.RinvPickupHdrDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvPickupHdrService;

@Service("rinvPickupHdrService")
@Transactional(readOnly=true)
public class RinvPickupHdrServiceImpl implements RinvPickupHdrService {

  @Autowired
  private RinvPickupHdrDAO rinvPickupHdrDAO;

  @Override
  public List<RinvPickupHdr> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvPickupHdrDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvPickupHdrDAO.count();
  }
}