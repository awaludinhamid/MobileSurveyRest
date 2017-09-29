package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstSomationType;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstSomationTypeDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstSomationTypeService;

@Service("cmTghMstSomationTypeService")
@Transactional(readOnly=true)
public class CmTghMstSomationTypeServiceImpl implements CmTghMstSomationTypeService {

  @Autowired
  private CmTghMstSomationTypeDAO cmTghMstSomationTypeDAO;

  @Override
  public List<CmTghMstSomationType> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstSomationTypeDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstSomationTypeDAO.count();
  }
}