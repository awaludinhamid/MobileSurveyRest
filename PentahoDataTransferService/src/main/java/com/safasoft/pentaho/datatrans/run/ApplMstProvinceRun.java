package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.ApplMstProvinceDest;
import com.safasoft.pentaho.datatrans.dest.service.ApplMstProvinceDestService;
import com.safasoft.pentaho.datatrans.src.bean.ApplMstProvince;
import com.safasoft.pentaho.datatrans.src.service.ApplMstProvinceService;

public class ApplMstProvinceRun extends
	BaseRun<ApplMstProvince,ApplMstProvinceService,ApplMstProvinceDest,ApplMstProvinceDestService> {

	@Override
	protected List<ApplMstProvince> getData(int pageNo, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		return service.getByPage(pageNo, numOfBulkRecord);
	}

	@Override
	protected int count() {
		// TODO Auto-generated method stub
		return service.count();
	}

	@Override
	protected void saveData(List<ApplMstProvince> bList, int numOfBulkRecord) {
		// TODO Auto-generated method stub
		List<ApplMstProvinceDest> ampdList = new ArrayList<>();
		for(ApplMstProvince amp : bList) {
			ApplMstProvinceDest ampd = new ApplMstProvinceDest();
			try {
				BeanUtils.copyProperties(ampd, amp);
			} catch (IllegalAccessException | InvocationTargetException e) {
				logger.error(e);
			}
			ampdList.add(ampd);
		}
		if(ampdList.size() > 0)
			service2.save(ampdList, numOfBulkRecord);
	}

	@Override
	protected int truncateTable(String tableName) {
		// TODO Auto-generated method stub
		return service2.truncateTable(tableName);
	}

}
