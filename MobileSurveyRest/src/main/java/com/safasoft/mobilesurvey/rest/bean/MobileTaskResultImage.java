package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * POJO table MOBILE_TASK_RESULT_IMAGE
 * @created Feb 13, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="MOBILE_TASK_RESULT_IMAGE")
public class MobileTaskResultImage implements Serializable {

	@Id
	@Column(name="IMAGE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int imageId;
	@Column(name="IMAGE")
	private byte[] image;
	@OneToMany(mappedBy="taskResultImage")
	private Set<MobileTaskResultDetailList> taskResultDetailLists;
	
	public Set<MobileTaskResultDetailList> getTaskResultDetailLists() {
		return taskResultDetailLists;
	}
	public void setTaskResultDetailLists(Set<MobileTaskResultDetailList> taskResultDetailLists) {
		this.taskResultDetailLists = taskResultDetailLists;
	}
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
