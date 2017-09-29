package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTbSaldo;
import com.safasoft.pentaho.datatrans.src.dao.CfinTbSaldoDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTbSaldoService;

@Service("cfinTbSaldoService")
@Transactional(readOnly=true)
public class CfinTbSaldoServiceImpl implements CfinTbSaldoService {

  @Autowired
  private CfinTbSaldoDAO cfinTbSaldoDAO;

  @Override
  public List<CfinTbSaldo> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTbSaldoDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTbSaldoDAO.count();
  }
}