package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiLkriHdr;
import com.safasoft.pentaho.datatrans.src.dao.CfinTrnRiLkriHdrDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiLkriHdrService;

@Service("cfinTrnRiLkriHdrService")
@Transactional(readOnly=true)
public class CfinTrnRiLkriHdrServiceImpl implements CfinTrnRiLkriHdrService {

  @Autowired
  private CfinTrnRiLkriHdrDAO cfinTrnRiLkriHdrDAO;

  @Override
  public List<CfinTrnRiLkriHdr> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTrnRiLkriHdrDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTrnRiLkriHdrDAO.count();
  }
}