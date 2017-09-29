package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstCycles;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstCyclesDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstCyclesService;

@Service("cmTghMstCyclesService")
@Transactional(readOnly=true)
public class CmTghMstCyclesServiceImpl implements CmTghMstCyclesService {

  @Autowired
  private CmTghMstCyclesDAO cmTghMstCyclesDAO;

  @Override
  public List<CmTghMstCycles> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstCyclesDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstCyclesDAO.count();
  }
}