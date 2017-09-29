package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstClassifications;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstClassificationsDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstClassificationsService;

@Service("cmTghMstClassificationsService")
@Transactional(readOnly=true)
public class CmTghMstClassificationsServiceImpl implements CmTghMstClassificationsService {

  @Autowired
  private CmTghMstClassificationsDAO cmTghMstClassificationsDAO;

  @Override
  public List<CmTghMstClassifications> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstClassificationsDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstClassificationsDAO.count();
  }
}