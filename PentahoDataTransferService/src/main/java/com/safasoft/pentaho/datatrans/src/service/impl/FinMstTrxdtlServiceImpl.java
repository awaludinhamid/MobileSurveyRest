package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinMstTrxdtl;
import com.safasoft.pentaho.datatrans.src.dao.FinMstTrxdtlDAO;
import com.safasoft.pentaho.datatrans.src.service.FinMstTrxdtlService;

@Service("finMstTrxdtlService")
@Transactional(readOnly=true)
public class FinMstTrxdtlServiceImpl implements FinMstTrxdtlService {

  @Autowired
  private FinMstTrxdtlDAO finMstTrxdtlDAO;

  @Override
  public List<FinMstTrxdtl> getByPage(int pageNo, int numOfBulkRecord) {
    return finMstTrxdtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finMstTrxdtlDAO.count();
  }
}