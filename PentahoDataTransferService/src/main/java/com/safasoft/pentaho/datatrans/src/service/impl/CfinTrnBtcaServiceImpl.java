package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnBtca;
import com.safasoft.pentaho.datatrans.src.dao.CfinTrnBtcaDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnBtcaService;

@Service("cfinTrnBtcaService")
@Transactional(readOnly=true)
public class CfinTrnBtcaServiceImpl implements CfinTrnBtcaService {

  @Autowired
  private CfinTrnBtcaDAO cfinTrnBtcaDAO;

  @Override
  public List<CfinTrnBtca> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTrnBtcaDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTrnBtcaDAO.count();
  }
}