package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiLkriDtl;
import com.safasoft.pentaho.datatrans.src.dao.CfinTrnRiLkriDtlDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiLkriDtlService;

@Service("cfinTrnRiLkriDtlService")
@Transactional(readOnly=true)
public class CfinTrnRiLkriDtlServiceImpl implements CfinTrnRiLkriDtlService {

  @Autowired
  private CfinTrnRiLkriDtlDAO cfinTrnRiLkriDtlDAO;

  @Override
  public List<CfinTrnRiLkriDtl> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTrnRiLkriDtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTrnRiLkriDtlDAO.count();
  }
}