package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinMstCardAccount;
import com.safasoft.pentaho.datatrans.src.dao.FinMstCardAccountDAO;
import com.safasoft.pentaho.datatrans.src.service.FinMstCardAccountService;

@Service("finMstCardAccountService")
@Transactional(readOnly=true)
public class FinMstCardAccountServiceImpl implements FinMstCardAccountService {

  @Autowired
  private FinMstCardAccountDAO finMstCardAccountDAO;

  @Override
  public List<FinMstCardAccount> getByPage(int pageNo, int numOfBulkRecord) {
    return finMstCardAccountDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finMstCardAccountDAO.count();
  }
}