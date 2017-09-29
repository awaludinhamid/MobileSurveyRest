package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghLkpDtls;
import com.safasoft.pentaho.datatrans.src.dao.CmTghLkpDtlsDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghLkpDtlsService;

@Service("cmTghLkpDtlsService")
@Transactional(readOnly=true)
public class CmTghLkpDtlsServiceImpl implements CmTghLkpDtlsService {

  @Autowired
  private CmTghLkpDtlsDAO cmTghLkpDtlsDAO;

  @Override
  public List<CmTghLkpDtls> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghLkpDtlsDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghLkpDtlsDAO.count();
  }
}