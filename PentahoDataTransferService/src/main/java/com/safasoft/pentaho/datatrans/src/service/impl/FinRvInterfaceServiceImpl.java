package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.FinRvInterface;
import com.safasoft.pentaho.datatrans.src.dao.FinRvInterfaceDAO;
import com.safasoft.pentaho.datatrans.src.service.FinRvInterfaceService;

@Service("finRvInterfaceService")
@Transactional(readOnly=true)
public class FinRvInterfaceServiceImpl implements FinRvInterfaceService {

  @Autowired
  private FinRvInterfaceDAO finRvInterfaceDAO;

  @Override
  public List<FinRvInterface> getByPage(int pageNo, int numOfBulkRecord) {
    return finRvInterfaceDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return finRvInterfaceDAO.count();
  }
}