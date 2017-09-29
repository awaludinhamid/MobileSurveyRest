package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghTrnVisitDtl;
import com.safasoft.pentaho.datatrans.src.dao.CmTghTrnVisitDtlDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghTrnVisitDtlService;

@Service("cmTghTrnVisitDtlService")
@Transactional(readOnly=true)
public class CmTghTrnVisitDtlServiceImpl implements CmTghTrnVisitDtlService {

  @Autowired
  private CmTghTrnVisitDtlDAO cmTghTrnVisitDtlDAO;

  @Override
  public List<CmTghTrnVisitDtl> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghTrnVisitDtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghTrnVisitDtlDAO.count();
  }
}