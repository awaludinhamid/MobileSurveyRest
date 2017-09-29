package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrMstJob;
import com.safasoft.pentaho.datatrans.src.dao.HrMstJobDAO;
import com.safasoft.pentaho.datatrans.src.service.HrMstJobService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrMstorgType;
import com.safasoft.pentaho.datatrans.src.dao.HrMstorgTypeDAO;
import com.safasoft.pentaho.datatrans.src.service.HrMstorgTypeService;

@Service("hrMstJobService")
@Transactional(readOnly=true)
public class HrMstJobServiceImpl implements HrMstJobService {

  @Autowired
  private HrMstJobDAO hrMstJobDAO;

  @Override
  public List<HrMstJob> getByPage(int pageNo, int numOfBulkRecord) {
    return hrMstJobDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrMstJobDAO.count();
  }
}