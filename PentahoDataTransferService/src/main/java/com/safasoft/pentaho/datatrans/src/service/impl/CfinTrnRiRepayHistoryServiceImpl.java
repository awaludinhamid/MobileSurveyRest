package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiRepayHistory;
import com.safasoft.pentaho.datatrans.src.dao.CfinTrnRiRepayHistoryDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiRepayHistoryService;

@Service("cfinTrnRiRepayHistoryService")
@Transactional(readOnly=true)
public class CfinTrnRiRepayHistoryServiceImpl implements CfinTrnRiRepayHistoryService {

  @Autowired
  private CfinTrnRiRepayHistoryDAO cfinTrnRiRepayHistoryDAO;

  @Override
  public List<CfinTrnRiRepayHistory> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTrnRiRepayHistoryDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTrnRiRepayHistoryDAO.count();
  }
}