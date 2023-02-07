package com.xworkz.marutiMvc.dto;

import lombok.Data;

@Data
public class BeverageDTO {
	

	private String name;
	private String color;
	private Double price;
	private String shopName;
	private String brand;
	private Integer types;
	private String flavour;
	private String buyer;
	private String quantity;
	private String sugarContent;
	
	public BeverageDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
