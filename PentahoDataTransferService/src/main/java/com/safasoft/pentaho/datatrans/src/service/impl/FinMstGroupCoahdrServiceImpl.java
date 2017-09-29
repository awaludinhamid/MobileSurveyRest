package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinMstGroupCoahdr;
import com.safasoft.pentaho.datatrans.src.dao.FinMstGroupCoahdrDAO;
import com.safasoft.pentaho.datatrans.src.service.FinMstGroupCoahdrService;

@Service("finMstGroupCoahdrService")
@Transactional(readOnly=true)
public class FinMstGroupCoahdrServiceImpl implements FinMstGroupCoahdrService {

  @Autowired
  private FinMstGroupCoahdrDAO finMstGroupCoahdrDAO;

  @Override
  public List<FinMstGroupCoahdr> getByPage(int pageNo, int numOfBulkRecord) {
    return finMstGroupCoahdrDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finMstGroupCoahdrDAO.count();
  }
}