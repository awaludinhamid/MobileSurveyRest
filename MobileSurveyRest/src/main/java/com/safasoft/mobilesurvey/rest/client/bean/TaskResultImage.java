package com.safasoft.mobilesurvey.rest.client.bean;

/**
 * POJO for Task Result Image entity
 * @created Jan 9, 2017
 * @author awal
 */
public class TaskResultImage {

	private int imageId;
	private byte[] image;
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
