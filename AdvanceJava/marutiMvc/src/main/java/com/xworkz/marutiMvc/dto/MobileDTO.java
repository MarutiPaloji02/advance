package com.xworkz.marutiMvc.dto;

import lombok.Data;

@Data
public class MobileDTO {
	
	private String brand;
	private String color;
	private double price;
	private int version;
	private String storage;
	
	public MobileDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
