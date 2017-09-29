package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvPkgsoldDtl;
import com.safasoft.pentaho.datatrans.src.dao.RinvPkgsoldDtlDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvPkgsoldDtlService;

@Service("rinvPkgsoldDtlService")
@Transactional(readOnly=true)
public class RinvPkgsoldDtlServiceImpl implements RinvPkgsoldDtlService {

  @Autowired
  private RinvPkgsoldDtlDAO rinvPkgsoldDtlDAO;

  @Override
  public List<RinvPkgsoldDtl> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvPkgsoldDtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvPkgsoldDtlDAO.count();
  }
}