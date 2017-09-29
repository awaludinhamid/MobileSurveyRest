package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrMstEmployeeSts;
import com.safasoft.pentaho.datatrans.src.dao.HrMstEmployeeStsDAO;
import com.safasoft.pentaho.datatrans.src.service.HrMstEmployeeStsService;

@Service("hrMstEmployeeStsService")
@Transactional(readOnly=true)
public class HrMstEmployeeStsServiceImpl implements HrMstEmployeeStsService {

  @Autowired
  private HrMstEmployeeStsDAO hrMstEmployeeStsDAO;

  @Override
  public List<HrMstEmployeeSts> getByPage(int pageNo, int numOfBulkRecord) {
    return hrMstEmployeeStsDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrMstEmployeeStsDAO.count();
  }
}