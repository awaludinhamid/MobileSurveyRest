package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstBenefitTypeDest;

public interface HrMstBenefitTypeDestService {

  List<HrMstBenefitTypeDest> save(List<HrMstBenefitTypeDest> domain, int bulkRecord);
  int truncateTable(String tableName);
}