package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.ApplUsersDest;
import com.safasoft.pentaho.datatrans.dest.dao.ApplUsersDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.ApplUsersDestService;

@Service("applUsersDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class ApplUsersDestServiceImpl implements ApplUsersDestService {

	@Autowired
	private ApplUsersDestDAO applUsersDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<ApplUsersDest> save(List<ApplUsersDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return applUsersDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return applUsersDestDAO.truncateTable(tableName);
	}
}
