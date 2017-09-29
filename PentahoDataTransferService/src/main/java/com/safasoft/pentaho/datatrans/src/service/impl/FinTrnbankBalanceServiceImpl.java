package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinTrnbankBalance;
import com.safasoft.pentaho.datatrans.src.dao.FinTrnbankBalanceDAO;
import com.safasoft.pentaho.datatrans.src.service.FinTrnbankBalanceService;

@Service("finTrnbankBalanceService")
@Transactional(readOnly=true)
public class FinTrnbankBalanceServiceImpl implements FinTrnbankBalanceService {

  @Autowired
  private FinTrnbankBalanceDAO finTrnbankBalanceDAO;

  @Override
  public List<FinTrnbankBalance> getByPage(int pageNo, int numOfBulkRecord) {
    return finTrnbankBalanceDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finTrnbankBalanceDAO.count();
  }
}