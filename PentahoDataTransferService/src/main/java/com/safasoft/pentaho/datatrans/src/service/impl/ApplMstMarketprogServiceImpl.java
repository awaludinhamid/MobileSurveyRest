package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplMstMarketprog;
import com.safasoft.pentaho.datatrans.src.dao.ApplMstMarketprogDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplMstMarketprogService;

@Service("applMstMarketprogService")
@Transactional(readOnly=true)
public class ApplMstMarketprogServiceImpl implements ApplMstMarketprogService {

  @Autowired
  private ApplMstMarketprogDAO applMstMarketprogDAO;

  @Override
  public List<ApplMstMarketprog> getByPage(int pageNo, int numOfBulkRecord) {
    return applMstMarketprogDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return applMstMarketprogDAO.count();
  }
}