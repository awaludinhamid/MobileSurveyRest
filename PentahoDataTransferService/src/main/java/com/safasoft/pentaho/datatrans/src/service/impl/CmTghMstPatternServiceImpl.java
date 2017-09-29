package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPattern;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstPatternDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstPatternService;

@Service("cmTghMstPatternService")
@Transactional(readOnly=true)
public class CmTghMstPatternServiceImpl implements CmTghMstPatternService {

  @Autowired
  private CmTghMstPatternDAO cmTghMstPatternDAO;

  @Override
  public List<CmTghMstPattern> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstPatternDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstPatternDAO.count();
  }
}