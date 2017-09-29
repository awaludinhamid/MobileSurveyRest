package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghTrnVisitHdr;
import com.safasoft.pentaho.datatrans.src.dao.CmTghTrnVisitHdrDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghTrnVisitHdrService;

@Service("cmTghTrnVisitHdrService")
@Transactional(readOnly=true)
public class CmTghTrnVisitHdrServiceImpl implements CmTghTrnVisitHdrService {

  @Autowired
  private CmTghTrnVisitHdrDAO cmTghTrnVisitHdrDAO;

  @Override
  public List<CmTghTrnVisitHdr> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghTrnVisitHdrDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghTrnVisitHdrDAO.count();
  }
}