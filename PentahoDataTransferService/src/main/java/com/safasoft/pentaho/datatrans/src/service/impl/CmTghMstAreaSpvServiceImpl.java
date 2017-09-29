package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstAreaSpv;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstAreaSpvDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstAreaSpvService;

@Service("cmTghMstAreaSpvService")
@Transactional(readOnly=true)
public class CmTghMstAreaSpvServiceImpl implements CmTghMstAreaSpvService {

  @Autowired
  private CmTghMstAreaSpvDAO cmTghMstAreaSpvDAO;

  @Override
  public List<CmTghMstAreaSpv> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstAreaSpvDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstAreaSpvDAO.count();
  }
}