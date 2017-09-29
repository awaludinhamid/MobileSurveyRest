package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CollMstLocation;
import com.safasoft.pentaho.datatrans.src.dao.CollMstLocationDAO;
import com.safasoft.pentaho.datatrans.src.service.CollMstLocationService;

@Service("collMstLocationService")
@Transactional(readOnly=true)
public class CollMstLocationServiceImpl implements CollMstLocationService {

  @Autowired
  private CollMstLocationDAO collMstLocationDAO;

  @Override
  public List<CollMstLocation> getByPage(int pageNo, int numOfBulkRecord) {
    return collMstLocationDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return collMstLocationDAO.count();
  }
}