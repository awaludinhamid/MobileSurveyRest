package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrMstPosition;
import com.safasoft.pentaho.datatrans.src.dao.HrMstPositionDAO;
import com.safasoft.pentaho.datatrans.src.service.HrMstPositionService;

@Service("hrMstPositionService")
@Transactional(readOnly=true)
public class HrMstPositionServiceImpl implements HrMstPositionService {

  @Autowired
  private HrMstPositionDAO hrMstPositionDAO;

  @Override
  public List<HrMstPosition> getByPage(int pageNo, int numOfBulkRecord) {
    return hrMstPositionDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrMstPositionDAO.count();
  }
}