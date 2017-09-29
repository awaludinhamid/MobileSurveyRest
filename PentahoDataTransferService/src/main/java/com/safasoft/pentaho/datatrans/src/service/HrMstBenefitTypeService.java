package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.HrMstBenefitType;

public interface HrMstBenefitTypeService {

  List<HrMstBenefitType> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}