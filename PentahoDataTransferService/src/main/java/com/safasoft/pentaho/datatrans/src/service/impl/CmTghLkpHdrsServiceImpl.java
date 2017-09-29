package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghLkpHdrs;
import com.safasoft.pentaho.datatrans.src.dao.CmTghLkpHdrsDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghLkpHdrsService;

@Service("cmTghLkpHdrsService")
@Transactional(readOnly=true)
public class CmTghLkpHdrsServiceImpl implements CmTghLkpHdrsService {

  @Autowired
  private CmTghLkpHdrsDAO cmTghLkpHdrsDAO;

  @Override
  public List<CmTghLkpHdrs> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghLkpHdrsDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghLkpHdrsDAO.count();
  }
}