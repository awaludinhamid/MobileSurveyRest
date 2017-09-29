package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinInvhdrMstparam;
import com.safasoft.pentaho.datatrans.src.dao.FinInvhdrMstparamDAO;
import com.safasoft.pentaho.datatrans.src.service.FinInvhdrMstparamService;

@Service("finInvhdrMstparamService")
@Transactional(readOnly=true)
public class FinInvhdrMstparamServiceImpl implements FinInvhdrMstparamService {

  @Autowired
  private FinInvhdrMstparamDAO finInvhdrMstparamDAO;

  @Override
  public List<FinInvhdrMstparam> getByPage(int pageNo, int numOfBulkRecord) {
    return finInvhdrMstparamDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finInvhdrMstparamDAO.count();
  }
}