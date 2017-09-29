package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.RinvTrnInventory;
import com.safasoft.pentaho.datatrans.src.dao.RinvTrnInventoryDAO;
import com.safasoft.pentaho.datatrans.src.service.RinvTrnInventoryService;

@Service("rinvTrnInventoryService")
@Transactional(readOnly=true)
public class RinvTrnInventoryServiceImpl implements RinvTrnInventoryService {

  @Autowired
  private RinvTrnInventoryDAO rinvTrnInventoryDAO;

  @Override
  public List<RinvTrnInventory> getByPage(int pageNo, int numOfBulkRecord) {
    return rinvTrnInventoryDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return rinvTrnInventoryDAO.count();
  }
}