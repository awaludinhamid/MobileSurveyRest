package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmMstPitStopDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmMstPitStopDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmMstPitStopDestService;

@Service("cmMstPitStopDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmMstPitStopDestServiceImpl implements CmMstPitStopDestService {

  @Autowired
  private CmMstPitStopDestDAO cmMstPitStopDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmMstPitStopDest> save(List<CmMstPitStopDest> domain, int bulkRecord) {
    return cmMstPitStopDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmMstPitStopDestDAO.truncateTable(tableName);
  }
}