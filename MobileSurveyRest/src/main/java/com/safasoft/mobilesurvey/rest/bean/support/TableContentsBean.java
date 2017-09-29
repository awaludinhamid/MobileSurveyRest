package com.safasoft.mobilesurvey.rest.bean.support;

import java.util.List;

/**
 * POJO dynamic table
 * @created Jan 9, 2017
 * @author awal
 */
public class TableContentsBean {

	private List<List<String>> data;
	private List<String> columns;
	private String returnField;
	
	public String getReturnField() {
		return returnField;
	}
	public void setReturnField(String returnField) {
		this.returnField = returnField;
	}
	public List<List<String>> getData() {
		return data;
	}
	public void setData(List<List<String>> data) {
		this.data = data;
	}
	public List<String> getColumns() {
		return columns;
	}
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}
}
