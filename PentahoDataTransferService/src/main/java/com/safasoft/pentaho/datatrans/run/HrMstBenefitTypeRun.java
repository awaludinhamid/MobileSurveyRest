package com.safasoft.pentaho.datatrans.run;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.safasoft.pentaho.datatrans.dest.bean.HrMstBenefitTypeDest;
import com.safasoft.pentaho.datatrans.dest.service.HrMstBenefitTypeDestService;
import com.safasoft.pentaho.datatrans.src.bean.HrMstBenefitType;
import com.safasoft.pentaho.datatrans.src.service.HrMstBenefitTypeService;

public class HrMstBenefitTypeRun extends
BaseRun<HrMstBenefitType,HrMstBenefitTypeService,HrMstBenefitTypeDest,HrMstBenefitTypeDestService> {

@Override
protected List<HrMstBenefitType> getData(int pageNo, int numOfBulkRecord) {
	  return service.getByPage(pageNo, numOfBulkRecord);
}

@Override
protected int count() {
 return service.count();
}

@Override
protected void saveData(List<HrMstBenefitType> bList, int numOfBulkRecord) {
 List<HrMstBenefitTypeDest> hmbtdList = new ArrayList<>();
 for(HrMstBenefitType hmbt : bList) {
   HrMstBenefitTypeDest hmbtd = new HrMstBenefitTypeDest();
   try {
     BeanUtils.copyProperties(hmbtd, hmbt);
   } catch (IllegalAccessException | InvocationTargetException e) {
     logger.error(e);
   }
   hmbtdList.add(hmbtd);
 }
 if(hmbtdList.size() > 0)
   service2.save(hmbtdList, numOfBulkRecord);
}

@Override
protected int truncateTable(String tableName) {
 return service2.truncateTable(tableName);
}

}