package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrMstorgType;
import com.safasoft.pentaho.datatrans.src.dao.HrMstorgTypeDAO;
import com.safasoft.pentaho.datatrans.src.service.HrMstorgTypeService;

@Service("hrMstorgTypeService")
@Transactional(readOnly=true)
public class HrMstorgTypeServiceImpl implements HrMstorgTypeService {

  @Autowired
  private HrMstorgTypeDAO hrMstorgTypeDAO;

  @Override
  public List<HrMstorgType> getByPage(int pageNo, int numOfBulkRecord) {
    return hrMstorgTypeDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrMstorgTypeDAO.count();
  }
}