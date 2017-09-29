package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinStktrKreditDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinStktrKreditDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinStktrKredit;
import com.safasoft.pentaho.datatrans.src.service.CfinStktrKreditService;

public class CfinStktrKreditRun extends
BaseRun<CfinStktrKredit,CfinStktrKreditService,CfinStktrKreditDest,CfinStktrKreditDestService> {

	@Override
	protected List<CfinStktrKredit> getData(int pageNo, int numOfRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinStktrKredit> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinStktrKreditDest> cskdList = new ArrayList<>();
		for(CfinStktrKredit csk : bList) {
			//System.out.println(csk.getBankCode());
			CfinStktrKreditDest cskd = new CfinStktrKreditDest();
			try {
				BeanUtils.copyProperties(cskd, csk);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cskdList.add(cskd);
		}
		if(cskdList.size() > 0)
			service2.save(cskdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
