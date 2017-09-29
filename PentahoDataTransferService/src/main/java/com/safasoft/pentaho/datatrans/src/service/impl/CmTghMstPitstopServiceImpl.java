package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPitstop;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstPitstopDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstPitstopService;

@Service("cmTghMstPitstopService")
@Transactional(readOnly=true)
public class CmTghMstPitstopServiceImpl implements CmTghMstPitstopService {

  @Autowired
  private CmTghMstPitstopDAO cmTghMstPitstopDAO;

  @Override
  public List<CmTghMstPitstop> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstPitstopDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstPitstopDAO.count();
  }
}