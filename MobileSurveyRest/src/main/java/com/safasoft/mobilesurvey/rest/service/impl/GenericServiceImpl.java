package com.safasoft.mobilesurvey.rest.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.safasoft.mobilesurvey.rest.bean.support.TableContentsBean;
import com.safasoft.mobilesurvey.rest.dao.GenericDAO;
import com.safasoft.mobilesurvey.rest.service.GenericService;

/**
 * Various service implementation (see the service for usage info)
 * @created Jan 9, 2017
 * @author awal
 */
@Service("genericService")
@Transactional(readOnly=true)
public class GenericServiceImpl implements GenericService {

	@Autowired
	private GenericDAO genericDAO;// DAO injection

	@Override
	public TableContentsBean getTableContens(String tableName) {
		// TODO Auto-generated method stub
	    TableContentsBean tcb = new TableContentsBean();
	    String tableNameTmp = tableName.replace(" ", ""); // avoid other sql injected than the table name
	    //
	    List<String> columns = genericDAO.getTableColumns(tableNameTmp);
	    if(columns == null || columns.size() == 0)
	    	return tcb;
	    StringBuilder columnsQuery = new StringBuilder();
	    String colDelimiter = "||'|'||";
	    for(String column : columns)
	    	columnsQuery.append(column).append(colDelimiter);
	    //
	    List<String> tableData = genericDAO.getTableData(tableNameTmp, columnsQuery.substring(0, columnsQuery.lastIndexOf(colDelimiter)));
	    List<List<String>> data = new ArrayList<>(); 
	    for(String row : tableData) {
	    	List<String> dataList = Arrays.asList(row.split("\\|"));
	    	data.add(dataList);
	    }
	    tcb.setColumns(columns);
	    tcb.setData(data);
	    tcb.setReturnField(genericDAO.getReturnField(tableNameTmp));
		//
		return tcb;
	}
}
