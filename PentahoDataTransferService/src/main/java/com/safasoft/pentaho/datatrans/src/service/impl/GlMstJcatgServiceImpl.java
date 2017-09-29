package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.GlMstJcatg;
import com.safasoft.pentaho.datatrans.src.dao.GlMstJcatgDAO;
import com.safasoft.pentaho.datatrans.src.service.GlMstJcatgService;

@Service("glMstJcatgService")
@Transactional(readOnly=true)
public class GlMstJcatgServiceImpl implements GlMstJcatgService {

  @Autowired
  private GlMstJcatgDAO glMstJcatgDAO;

  @Override
  public List<GlMstJcatg> getByPage(int pageNo, int numOfBulkRecord) {
    return glMstJcatgDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
  }

  @Override
  public int count() {
    return glMstJcatgDAO.count();
  }
}