package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmMstPitStop;
import com.safasoft.pentaho.datatrans.src.dao.CmMstPitStopDAO;
import com.safasoft.pentaho.datatrans.src.service.CmMstPitStopService;

@Service("cmMstPitStopService")
@Transactional(readOnly=true)
public class CmMstPitStopServiceImpl implements CmMstPitStopService {

  @Autowired
  private CmMstPitStopDAO cmMstPitStopDAO;

  @Override
  public List<CmMstPitStop> getByPage(int pageNo, int numOfBulkRecord) {
    return cmMstPitStopDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmMstPitStopDAO.count();
  }
}