package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinMstGroupCoadtl;
import com.safasoft.pentaho.datatrans.src.dao.FinMstGroupCoadtlDAO;
import com.safasoft.pentaho.datatrans.src.service.FinMstGroupCoadtlService;

@Service("finMstGroupCoadtlService")
@Transactional(readOnly=true)
public class FinMstGroupCoadtlServiceImpl implements FinMstGroupCoadtlService {

  @Autowired
  private FinMstGroupCoadtlDAO finMstGroupCoadtlDAO;

  @Override
  public List<FinMstGroupCoadtl> getByPage(int pageNo, int numOfBulkRecord) {
    return finMstGroupCoadtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finMstGroupCoadtlDAO.count();
  }
}