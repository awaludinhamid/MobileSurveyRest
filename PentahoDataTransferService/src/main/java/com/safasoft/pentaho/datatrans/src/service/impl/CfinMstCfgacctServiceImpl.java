package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinMstCfgacct;
import com.safasoft.pentaho.datatrans.src.dao.CfinMstCfgacctDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinMstCfgacctService;

@Service("cfinMstCfgacctService")
@Transactional(readOnly=true)
public class CfinMstCfgacctServiceImpl implements CfinMstCfgacctService {

  @Autowired
  private CfinMstCfgacctDAO cfinMstCfgacctDAO;

  @Override
  public List<CfinMstCfgacct> getByPage(int pageNo, int numOfBulkRecord) {
    return cfinMstCfgacctDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cfinMstCfgacctDAO.count();
  }
}