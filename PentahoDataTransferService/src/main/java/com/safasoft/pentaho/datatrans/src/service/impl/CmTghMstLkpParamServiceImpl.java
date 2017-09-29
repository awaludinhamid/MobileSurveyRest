package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstLkpParam;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstLkpParamDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstLkpParamService;

@Service("cmTghMstLkpParamService")
@Transactional(readOnly=true)
public class CmTghMstLkpParamServiceImpl implements CmTghMstLkpParamService {

  @Autowired
  private CmTghMstLkpParamDAO cmTghMstLkpParamDAO;

  @Override
  public List<CmTghMstLkpParam> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstLkpParamDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstLkpParamDAO.count();
  }
}