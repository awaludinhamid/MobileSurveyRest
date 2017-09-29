package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPotential;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstPotentialDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstPotentialService;

@Service("cmTghMstPotentialService")
@Transactional(readOnly=true)
public class CmTghMstPotentialServiceImpl implements CmTghMstPotentialService {

  @Autowired
  private CmTghMstPotentialDAO cmTghMstPotentialDAO;

  @Override
  public List<CmTghMstPotential> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstPotentialDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstPotentialDAO.count();
  }
}