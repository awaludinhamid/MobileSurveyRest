package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstDelqReasons;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstDelqReasonsDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstDelqReasonsService;

@Service("cmTghMstDelqReasonsService")
@Transactional(readOnly=true)
public class CmTghMstDelqReasonsServiceImpl implements CmTghMstDelqReasonsService {

  @Autowired
  private CmTghMstDelqReasonsDAO cmTghMstDelqReasonsDAO;

  @Override
  public List<CmTghMstDelqReasons> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstDelqReasonsDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstDelqReasonsDAO.count();
  }
}