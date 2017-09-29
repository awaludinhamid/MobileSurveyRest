package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrPeopleAll;
import com.safasoft.pentaho.datatrans.src.dao.HrPeopleAllDAO;
import com.safasoft.pentaho.datatrans.src.service.HrPeopleAllService;

@Service("hrPeopleAllService")
@Transactional(readOnly=true)
public class HrPeopleAllServiceImpl implements HrPeopleAllService {

  @Autowired
  private HrPeopleAllDAO hrPeopleAllDAO;

  @Override
  public List<HrPeopleAll> getByPage(int pageNo, int numOfBulkRecord) {
    return hrPeopleAllDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrPeopleAllDAO.count();
  }
}