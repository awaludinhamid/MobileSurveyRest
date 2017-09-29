package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstBenefitTypeDest;
import com.safasoft.pentaho.datatrans.dest.dao.HrMstBenefitTypeDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.HrMstBenefitTypeDestService;

@Service("hrMstBenefitTypeDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class HrMstBenefitTypeDestServiceImpl implements HrMstBenefitTypeDestService {

  @Autowired
  private HrMstBenefitTypeDestDAO hrMstBenefitTypeDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<HrMstBenefitTypeDest> save(List<HrMstBenefitTypeDest> domain, int bulkRecord) {
    return hrMstBenefitTypeDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return hrMstBenefitTypeDestDAO.truncateTable(tableName);
  }
}