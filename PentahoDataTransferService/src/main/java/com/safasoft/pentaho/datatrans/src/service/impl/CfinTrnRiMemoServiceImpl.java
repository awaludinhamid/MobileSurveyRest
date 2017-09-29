package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnRiMemo;
import com.safasoft.pentaho.datatrans.src.dao.CfinTrnRiMemoDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnRiMemoService;

@Service("cfinTrnRiMemoService")
@Transactional(readOnly=true)
public class CfinTrnRiMemoServiceImpl implements CfinTrnRiMemoService {

  @Autowired
  private CfinTrnRiMemoDAO cfinTrnRiMemoDAO;

  @Override
  public List<CfinTrnRiMemo> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTrnRiMemoDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTrnRiMemoDAO.count();
  }
}