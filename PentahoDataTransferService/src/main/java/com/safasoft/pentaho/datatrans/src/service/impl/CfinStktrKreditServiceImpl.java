package com.safasoft.pentaho.datatrans.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.pentaho.datatrans.src.bean.CfinStktrKredit;
import com.safasoft.pentaho.datatrans.src.dao.CfinStktrKreditDAO;
import com.safasoft.pentaho.datatrans.src.service.CfinStktrKreditService;

@Service("cfinStktrKreditService")
@Transactional(readOnly=true)
public class CfinStktrKreditServiceImpl implements CfinStktrKreditService {

	@Autowired
	private CfinStktrKreditDAO cfinStktrKreditDAO;

	@Override
	public List<CfinStktrKredit> getByPage(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return cfinStktrKreditDAO.getByRange((pageNo - 1) * numOfBulkRecord, numOfBulkRecord);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cfinStktrKreditDAO.count();
	}
}
