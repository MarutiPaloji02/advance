package com.xworkz.marutiMvc.dto;

import lombok.Data;

@Data
public class FamilyDTO {
	
	private String fatherName;
	private String motherName;
	private String ElderSisterName;
	private String sisterName;
	private String sirName;
	private String cousinName;
	private Integer noOfMembers;
	private String fathersWork;
	private String myName;
	private String brotherName;
	
	public FamilyDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
