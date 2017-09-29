package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinMstPphcode;
import com.safasoft.pentaho.datatrans.src.dao.FinMstPphcodeDAO;
import com.safasoft.pentaho.datatrans.src.service.FinMstPphcodeService;

@Service("finMstPphcodeService")
@Transactional(readOnly=true)
public class FinMstPphcodeServiceImpl implements FinMstPphcodeService {

  @Autowired
  private FinMstPphcodeDAO finMstPphcodeDAO;

  @Override
  public List<FinMstPphcode> getByPage(int pageNo, int numOfBulkRecord) {
    return finMstPphcodeDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finMstPphcodeDAO.count();
  }
}