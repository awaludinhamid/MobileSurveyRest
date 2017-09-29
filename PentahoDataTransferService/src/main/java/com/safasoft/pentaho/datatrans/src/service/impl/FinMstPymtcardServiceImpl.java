package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinMstPymtcard;
import com.safasoft.pentaho.datatrans.src.dao.FinMstPymtcardDAO;
import com.safasoft.pentaho.datatrans.src.service.FinMstPymtcardService;

@Service("finMstPymtcardService")
@Transactional(readOnly=true)
public class FinMstPymtcardServiceImpl implements FinMstPymtcardService {

  @Autowired
  private FinMstPymtcardDAO finMstPymtcardDAO;

  @Override
  public List<FinMstPymtcard> getByPage(int pageNo, int numOfBulkRecord) {
    return finMstPymtcardDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finMstPymtcardDAO.count();
  }
}