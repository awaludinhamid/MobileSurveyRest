package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstPriorities;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstPrioritiesDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstPrioritiesService;

@Service("cmTghMstPrioritiesService")
@Transactional(readOnly=true)
public class CmTghMstPrioritiesServiceImpl implements CmTghMstPrioritiesService {

  @Autowired
  private CmTghMstPrioritiesDAO cmTghMstPrioritiesDAO;

  @Override
  public List<CmTghMstPriorities> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstPrioritiesDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstPrioritiesDAO.count();
  }
}