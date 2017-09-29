package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrDeptAll;
import com.safasoft.pentaho.datatrans.src.dao.HrDeptAllDAO;
import com.safasoft.pentaho.datatrans.src.service.HrDeptAllService;

@Service("hrDeptAllService")
@Transactional(readOnly=true)
public class HrDeptAllServiceImpl implements HrDeptAllService {

  @Autowired
  private HrDeptAllDAO hrDeptAllDAO;

  @Override
  public List<HrDeptAll> getByPage(int pageNo, int numOfBulkRecord) {
    return hrDeptAllDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrDeptAllDAO.count();
  }
}