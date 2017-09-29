package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnContracts;
import com.safasoft.pentaho.datatrans.src.dao.CfinTrnContractsDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnContractsService;

@Service("cfinTrnContractsService")
@Transactional(readOnly=true)
public class CfinTrnContractsServiceImpl implements CfinTrnContractsService {

  @Autowired
  private CfinTrnContractsDAO cfinTrnContractsDAO;

  @Override
  public List<CfinTrnContracts> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTrnContractsDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTrnContractsDAO.count();
  }
}