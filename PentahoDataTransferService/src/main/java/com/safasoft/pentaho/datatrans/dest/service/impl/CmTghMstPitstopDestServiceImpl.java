package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPitstopDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstPitstopDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstPitstopDestService;

@Service("cmTghMstPitstopDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstPitstopDestServiceImpl implements CmTghMstPitstopDestService {

  @Autowired
  private CmTghMstPitstopDestDAO cmTghMstPitstopDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstPitstopDest> save(List<CmTghMstPitstopDest> domain, int bulkRecord) {
    return cmTghMstPitstopDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstPitstopDestDAO.truncateTable(tableName);
  }
}