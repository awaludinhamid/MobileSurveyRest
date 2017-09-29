package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstActionPlan;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstActionPlanDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstActionPlanService;

@Service("cmTghMstActionPlanService")
@Transactional(readOnly=true)
public class CmTghMstActionPlanServiceImpl implements CmTghMstActionPlanService {

  @Autowired
  private CmTghMstActionPlanDAO cmTghMstActionPlanDAO;

  @Override
  public List<CmTghMstActionPlan> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstActionPlanDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstActionPlanDAO.count();
  }
}