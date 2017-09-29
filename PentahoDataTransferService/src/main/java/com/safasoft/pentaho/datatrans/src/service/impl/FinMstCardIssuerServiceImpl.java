package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinMstCardIssuer;
import com.safasoft.pentaho.datatrans.src.dao.FinMstCardIssuerDAO;
import com.safasoft.pentaho.datatrans.src.service.FinMstCardIssuerService;

@Service("finMstCardIssuerService")
@Transactional(readOnly=true)
public class FinMstCardIssuerServiceImpl implements FinMstCardIssuerService {

  @Autowired
  private FinMstCardIssuerDAO finMstCardIssuerDAO;

  @Override
  public List<FinMstCardIssuer> getByPage(int pageNo, int numOfBulkRecord) {
    return finMstCardIssuerDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finMstCardIssuerDAO.count();
  }
}