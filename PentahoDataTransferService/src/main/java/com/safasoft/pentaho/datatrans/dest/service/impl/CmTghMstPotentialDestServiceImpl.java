package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CmTghMstPotentialDest;
import com.safasoft.pentaho.datatrans.dest.dao.CmTghMstPotentialDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CmTghMstPotentialDestService;

@Service("cmTghMstPotentialDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CmTghMstPotentialDestServiceImpl implements CmTghMstPotentialDestService {

  @Autowired
  private CmTghMstPotentialDestDAO cmTghMstPotentialDestDAO;

  @Override
  @Transactional(readOnly=false,value="transactionManager2")
  public List<CmTghMstPotentialDest> save(List<CmTghMstPotentialDest> domain, int bulkRecord) {
    return cmTghMstPotentialDestDAO.save(domain, bulkRecord);
  }

  @Override
	@Transactional(readOnly=false,value="transactionManager2")
  public int truncateTable(String tableName) {
    return cmTghMstPotentialDestDAO.truncateTable(tableName);
  }
}