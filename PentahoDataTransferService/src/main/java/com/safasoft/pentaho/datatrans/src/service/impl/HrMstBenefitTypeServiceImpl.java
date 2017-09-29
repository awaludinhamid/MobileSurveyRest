package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.HrMstBenefitType;
import com.safasoft.pentaho.datatrans.src.dao.HrMstBenefitTypeDAO;
import com.safasoft.pentaho.datatrans.src.service.HrMstBenefitTypeService;

@Service("hrMstBenefitTypeService")
@Transactional(readOnly=true)
public class HrMstBenefitTypeServiceImpl implements HrMstBenefitTypeService {

  @Autowired
  private HrMstBenefitTypeDAO hrMstBenefitTypeDAO;

  @Override
  public List<HrMstBenefitType> getByPage(int pageNo, int numOfBulkRecord) {
    return hrMstBenefitTypeDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return hrMstBenefitTypeDAO.count();
  }
}