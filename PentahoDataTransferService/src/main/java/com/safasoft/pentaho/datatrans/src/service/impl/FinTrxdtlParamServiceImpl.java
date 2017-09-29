package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinTrxdtlParam;
import com.safasoft.pentaho.datatrans.src.dao.FinTrxdtlParamDAO;
import com.safasoft.pentaho.datatrans.src.service.FinTrxdtlParamService;

@Service("finTrxdtlParamService")
@Transactional(readOnly=true)
public class FinTrxdtlParamServiceImpl implements FinTrxdtlParamService {

  @Autowired
  private FinTrxdtlParamDAO finTrxdtlParamDAO;

  @Override
  public List<FinTrxdtlParam> getByPage(int pageNo, int numOfBulkRecord) {
    return finTrxdtlParamDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finTrxdtlParamDAO.count();
  }
}