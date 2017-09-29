package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstUnitLocation;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstUnitLocationDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstUnitLocationService;

@Service("cmTghMstUnitLocationService")
@Transactional(readOnly=true)
public class CmTghMstUnitLocationServiceImpl implements CmTghMstUnitLocationService {

  @Autowired
  private CmTghMstUnitLocationDAO cmTghMstUnitLocationDAO;

  @Override
  public List<CmTghMstUnitLocation> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstUnitLocationDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstUnitLocationDAO.count();
  }
}