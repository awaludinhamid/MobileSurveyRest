package com.safasoft.mobilesurvey.rest.dto.client;

/**
 * DTO table MOBILE_TASK_RESULT_IMAGE on client side
 * 
 * @author awal
 * @created Feb 20, 2017
 */
public class MobileTaskResultImageDTOClient {

	private int imageId;
	private byte[] image;
	
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
}
