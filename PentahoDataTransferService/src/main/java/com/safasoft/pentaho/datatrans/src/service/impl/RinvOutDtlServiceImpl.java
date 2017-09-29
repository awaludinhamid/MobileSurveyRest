package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvOutDtl;
import com.safasoft.pentaho.datatrans.src.dao.RinvOutDtlDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvOutDtlService;

@Service("rinvOutDtlService")
@Transactional(readOnly=true)
public class RinvOutDtlServiceImpl implements RinvOutDtlService {

  @Autowired
  private RinvOutDtlDAO rinvOutDtlDAO;

  @Override
  public List<RinvOutDtl> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvOutDtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvOutDtlDAO.count();
  }
}