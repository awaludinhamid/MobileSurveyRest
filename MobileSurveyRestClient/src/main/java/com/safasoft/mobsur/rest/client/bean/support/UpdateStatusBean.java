package com.safasoft.mobsur.rest.client.bean.support;

import java.util.List;

public class UpdateStatusBean {

	private String status;
	private List<String> idList;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getIdList() {
		return idList;
	}
	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}
