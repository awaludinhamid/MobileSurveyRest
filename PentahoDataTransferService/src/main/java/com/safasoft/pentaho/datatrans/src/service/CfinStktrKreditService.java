package com.safasoft.pentaho.datatrans.src.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.src.bean.CfinStktrKredit;

public interface CfinStktrKreditService {

	List<CfinStktrKredit> getByPage(int pageNo, int numOfBulkRecord);
	int count();
}
