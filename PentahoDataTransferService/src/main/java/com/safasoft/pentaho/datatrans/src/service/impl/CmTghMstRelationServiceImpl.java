package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstRelation;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstRelationDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstRelationService;

@Service("cmTghMstRelationService")
@Transactional(readOnly=true)
public class CmTghMstRelationServiceImpl implements CmTghMstRelationService {

  @Autowired
  private CmTghMstRelationDAO cmTghMstRelationDAO;

  @Override
  public List<CmTghMstRelation> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstRelationDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstRelationDAO.count();
  }
}