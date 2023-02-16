package com.xworkz.valentineApp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@javax.persistence.Entity
@Table(name="valentine_table")
public class ValentineEntity {
	

	@Id
	@Column(name="v_id")
	private int id;
	@Column(name="v_name")
	private String name;
	@Column(name="v_valentineName")
	private String valentineName;
	@Column(name="v_place")
	private String place;
	@Column(name="v_gift")
	private String gift;

}
