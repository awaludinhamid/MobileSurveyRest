package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CmTghMstAreaZona;
import com.safasoft.pentaho.datatrans.src.dao.CmTghMstAreaZonaDAO;
import com.safasoft.pentaho.datatrans.src.service.CmTghMstAreaZonaService;

@Service("cmTghMstAreaZonaService")
@Transactional(readOnly=true)
public class CmTghMstAreaZonaServiceImpl implements CmTghMstAreaZonaService {

  @Autowired
  private CmTghMstAreaZonaDAO cmTghMstAreaZonaDAO;

  @Override
  public List<CmTghMstAreaZona> getByPage(int pageNo, int numOfBulkRecord) {
    return cmTghMstAreaZonaDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return cmTghMstAreaZonaDAO.count();
  }
}