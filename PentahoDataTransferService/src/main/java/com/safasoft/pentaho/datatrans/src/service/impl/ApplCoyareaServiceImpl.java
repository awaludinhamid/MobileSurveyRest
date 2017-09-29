package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.ApplCoyarea;
import com.safasoft.pentaho.datatrans.src.dao.ApplCoyareaDAO;
import com.safasoft.pentaho.datatrans.src.service.ApplCoyareaService;

@Service("applCoyareaService")
@Transactional(readOnly=true)
public class ApplCoyareaServiceImpl implements ApplCoyareaService {

  @Autowired
  private ApplCoyareaDAO applCoyareaDAO;

  @Override
  public List<ApplCoyarea> getByPage(int pageNo, int numOfBulkRecord) {
    return applCoyareaDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return applCoyareaDAO.count();
  }
}