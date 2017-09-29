package com.safasoft.mobilesurvey.rest.bean.support;

/**
 * POJO for container of response contents
 * @created Oct 19, 2016
 * @author awal
 */
public class RestResponseBean {

	private int status = 0;
	private String statusName = "success";
	private Object contents;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public Object getContents() {
		return contents;
	}
	public void setContents(Object contents) {
		this.contents = contents;
	}
}
