package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvReceivedHdr;
import com.safasoft.pentaho.datatrans.src.dao.RinvReceivedHdrDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvReceivedHdrService;

@Service("rinvReceivedHdrService")
@Transactional(readOnly=true)
public class RinvReceivedHdrServiceImpl implements RinvReceivedHdrService {

  @Autowired
  private RinvReceivedHdrDAO rinvReceivedHdrDAO;

  @Override
  public List<RinvReceivedHdr> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvReceivedHdrDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvReceivedHdrDAO.count();
  }
}