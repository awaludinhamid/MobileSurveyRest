package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTermination;
import com.safasoft.pentaho.datatrans.src.dao.CfinTerminationDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTerminationService;

@Service("cfinTerminationService")
@Transactional(readOnly=true)
public class CfinTerminationServiceImpl implements CfinTerminationService {

  @Autowired
  private CfinTerminationDAO cfinTerminationDAO;

  @Override
  public List<CfinTermination> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTerminationDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTerminationDAO.count();
  }
}