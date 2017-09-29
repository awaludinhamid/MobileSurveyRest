package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.CfinMstRiFamilyMeetDest;
import com.safasoft.pentaho.datatrans.dest.service.CfinMstRiFamilyMeetDestService;
import com.safasoft.pentaho.datatrans.src.bean.CfinMstRiFamilyMeet;
import com.safasoft.pentaho.datatrans.src.service.CfinMstRiFamilyMeetService;

public class CfinMstRiFamilyMeetRun extends
	BaseRun<CfinMstRiFamilyMeet,CfinMstRiFamilyMeetService,CfinMstRiFamilyMeetDest,CfinMstRiFamilyMeetDestService> {

	@Override
	protected List<CfinMstRiFamilyMeet> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<CfinMstRiFamilyMeet> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<CfinMstRiFamilyMeetDest> cmrdList = new ArrayList<>();
		for(CfinMstRiFamilyMeet cmr : bList) {
			CfinMstRiFamilyMeetDest cmrd = new CfinMstRiFamilyMeetDest();
			try {
				BeanUtils.copyProperties(cmrd, cmr);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			cmrdList.add(cmrd);
		}
		if(cmrdList.size() > 0)
			service2.save(cmrdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
