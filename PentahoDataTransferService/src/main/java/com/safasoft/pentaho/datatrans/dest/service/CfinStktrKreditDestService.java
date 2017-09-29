package com.safasoft.pentaho.datatrans.dest.service;

import java.util.List;

import com.safasoft.pentaho.datatrans.dest.bean.CfinStktrKreditDest;

public interface CfinStktrKreditDestService {

	List<CfinStktrKreditDest> save(List<CfinStktrKreditDest> domain, int bulkRecord);
	int truncateTable(String tableName);
}
