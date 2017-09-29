package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinRvhdrMstparam;
import com.safasoft.pentaho.datatrans.src.dao.FinRvhdrMstparamDAO;
import com.safasoft.pentaho.datatrans.src.service.FinRvhdrMstparamService;

@Service("finRvhdrMstparamService")
@Transactional(readOnly=true)
public class FinRvhdrMstparamServiceImpl implements FinRvhdrMstparamService {

  @Autowired
  private FinRvhdrMstparamDAO finRvhdrMstparamDAO;

  @Override
  public List<FinRvhdrMstparam> getByPage(int pageNo, int numOfBulkRecord) {
    return finRvhdrMstparamDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finRvhdrMstparamDAO.count();
  }
}