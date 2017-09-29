package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrMstRelation;
import com.safasoft.pentaho.datatrans.src.dao.HrMstRelationDAO;
import com.safasoft.pentaho.datatrans.src.service.HrMstRelationService;

@Service("hrMstRelationService")
@Transactional(readOnly=true)
public class HrMstRelationServiceImpl implements HrMstRelationService {

  @Autowired
  private HrMstRelationDAO hrMstRelationDAO;

  @Override
  public List<HrMstRelation> getByPage(int pageNo, int numOfBulkRecord) {
    return hrMstRelationDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrMstRelationDAO.count();
  }
}