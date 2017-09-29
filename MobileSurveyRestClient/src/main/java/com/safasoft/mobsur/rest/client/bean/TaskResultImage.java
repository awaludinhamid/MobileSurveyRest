package com.safasoft.mobsur.rest.client.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
@Table(name="MBS_TASK_RESULT_IMAGE")
public class TaskResultImage implements Serializable {

	@Id
	@Column(name="IMAGE_ID")
	private int imageId;
	@Column(name="IMAGE")
	private byte[] image;
	
	@Transient
	private String imageStr64;
	
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getImageStr64() {
		return imageStr64;
	}
	public void setImageStr64(String imageStr64) {
		this.imageStr64 = imageStr64;
	}

}
