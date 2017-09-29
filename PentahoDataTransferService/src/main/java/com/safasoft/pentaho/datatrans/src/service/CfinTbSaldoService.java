package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinTbSaldo;

public interface CfinTbSaldoService {

  List<CfinTbSaldo> getByPage(int pageNo, int numOfBulkRecord);
  int count();
}