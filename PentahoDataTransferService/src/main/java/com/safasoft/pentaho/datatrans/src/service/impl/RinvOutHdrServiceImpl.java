package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvOutHdr;
import com.safasoft.pentaho.datatrans.src.dao.RinvOutHdrDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvOutHdrService;

@Service("rinvOutHdrService")
@Transactional(readOnly=true)
public class RinvOutHdrServiceImpl implements RinvOutHdrService {

  @Autowired
  private RinvOutHdrDAO rinvOutHdrDAO;

  @Override
  public List<RinvOutHdr> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvOutHdrDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvOutHdrDAO.count();
  }
}