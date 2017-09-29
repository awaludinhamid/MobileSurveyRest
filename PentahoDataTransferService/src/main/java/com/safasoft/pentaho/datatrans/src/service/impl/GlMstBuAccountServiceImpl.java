package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.GlMstBuAccount;
import com.safasoft.pentaho.datatrans.src.dao.GlMstBuAccountDAO;
import com.safasoft.pentaho.datatrans.src.service.GlMstBuAccountService;

@Service("glMstBuAccountService")
@Transactional(readOnly=true)
public class GlMstBuAccountServiceImpl implements GlMstBuAccountService {

  @Autowired
  private GlMstBuAccountDAO glMstBuAccountDAO;

  @Override
  public List<GlMstBuAccount> getByPage(int pageNo, int numOfBulkRecord) {
    return glMstBuAccountDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return glMstBuAccountDAO.count();
  }
}