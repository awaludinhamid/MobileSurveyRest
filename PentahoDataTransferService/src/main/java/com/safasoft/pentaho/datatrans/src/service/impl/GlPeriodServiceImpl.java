package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.GlPeriod;
import com.safasoft.pentaho.datatrans.src.dao.GlPeriodDAO;
import com.safasoft.pentaho.datatrans.src.service.GlPeriodService;

@Service("glPeriodService")
@Transactional(readOnly=true)
public class GlPeriodServiceImpl implements GlPeriodService {

  @Autowired
  private GlPeriodDAO glPeriodDAO;

  @Override
  public List<GlPeriod> getByPage(int pageNo, int numOfBulkRecord) {
    return glPeriodDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return glPeriodDAO.count();
  }
}