package com.safasoft.mobilesurvey.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * POJO view LOOKUP_TABLE_VW
 * @created Feb 5, 2017
 * @author awal
 */
@SuppressWarnings("serial")
@Entity
@Table(name="LOOKUP_TABLE_VW")
public class LookupTableVw implements Serializable {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="TABLE_NAME")
	private String tableName;
	@Column(name="COLUMN_NAME")
	private String columnName;
}
