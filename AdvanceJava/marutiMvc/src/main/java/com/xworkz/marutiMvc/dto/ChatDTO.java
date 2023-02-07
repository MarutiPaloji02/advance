package com.xworkz.marutiMvc.dto;

import lombok.Data;

@Data
public class ChatDTO {
	
	private int id;
	private String name;
	private Double price;
	private String centerName;
	private String location;
	private String type;
	private String buyerName;
	private String madeBy;
	private String coolDrinkName;
	private String quantity;
	private boolean taste;
	
	public ChatDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
