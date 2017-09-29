package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvReceivedDtl;
import com.safasoft.pentaho.datatrans.src.dao.RinvReceivedDtlDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvReceivedDtlService;

@Service("rinvReceivedDtlService")
@Transactional(readOnly=true)
public class RinvReceivedDtlServiceImpl implements RinvReceivedDtlService {

  @Autowired
  private RinvReceivedDtlDAO rinvReceivedDtlDAO;

  @Override
  public List<RinvReceivedDtl> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvReceivedDtlDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvReceivedDtlDAO.count();
  }
}