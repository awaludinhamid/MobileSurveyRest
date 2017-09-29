package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinTrnOrder;
import com.safasoft.pentaho.datatrans.src.dao.CfinTrnOrderDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinTrnOrderService;

@Service("cfinTrnOrderService")
@Transactional(readOnly=true)
public class CfinTrnOrderServiceImpl implements CfinTrnOrderService {

  @Autowired
  private CfinTrnOrderDAO cfinTrnOrderDAO;

  @Override
  public List<CfinTrnOrder> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinTrnOrderDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinTrnOrderDAO.count();
  }
}