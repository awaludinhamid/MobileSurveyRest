package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinTrncashBalance;
import com.safasoft.pentaho.datatrans.src.dao.FinTrncashBalanceDAO;
import com.safasoft.pentaho.datatrans.src.service.FinTrncashBalanceService;

@Service("finTrncashBalanceService")
@Transactional(readOnly=true)
public class FinTrncashBalanceServiceImpl implements FinTrncashBalanceService {

  @Autowired
  private FinTrncashBalanceDAO finTrncashBalanceDAO;

  @Override
  public List<FinTrncashBalance> getByPage(int pageNo, int numOfBulkRecord) {
    return finTrncashBalanceDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finTrncashBalanceDAO.count();
  }
}