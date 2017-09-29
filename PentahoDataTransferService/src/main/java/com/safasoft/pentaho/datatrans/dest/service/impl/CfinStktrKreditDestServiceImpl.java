package com.safasoft.pentaho.datatrans.dest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.dest.bean.CfinStktrKreditDest;
import com.safasoft.pentaho.datatrans.dest.dao.CfinStktrKreditDestDAO;
import com.safasoft.pentaho.datatrans.dest.service.CfinStktrKreditDestService;

@Service("cfinStktrKreditDestService")
@Transactional(readOnly=true,value="transactionManager2")
public class CfinStktrKreditDestServiceImpl implements CfinStktrKreditDestService {

	@Autowired
	private CfinStktrKreditDestDAO cfinStktrKreditDestDAO;

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public List<CfinStktrKreditDest> save(List<CfinStktrKreditDest> domain, int bulkRecord) {
		// TODO Auto-generated method stub
		return cfinStktrKreditDestDAO.save(domain, bulkRecord);
	}

	@Override
	@Transactional(readOnly=false,value="transactionManager2")
	public int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return cfinStktrKreditDestDAO.truncateTable(tableName);
	}
}
