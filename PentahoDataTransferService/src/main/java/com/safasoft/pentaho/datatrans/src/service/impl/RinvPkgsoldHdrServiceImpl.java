package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvPkgsoldHdr;
import com.safasoft.pentaho.datatrans.src.dao.RinvPkgsoldHdrDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvPkgsoldHdrService;

@Service("rinvPkgsoldHdrService")
@Transactional(readOnly=true)
public class RinvPkgsoldHdrServiceImpl implements RinvPkgsoldHdrService {

  @Autowired
  private RinvPkgsoldHdrDAO rinvPkgsoldHdrDAO;

  @Override
  public List<RinvPkgsoldHdr> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvPkgsoldHdrDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvPkgsoldHdrDAO.count();
  }
}