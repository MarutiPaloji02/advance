package com.xworkz.valentineApp.dto;

import lombok.Data;

@Data
public class ValentineDTO {
	
	@Size(min = 3, max = 20, message = "Name Cannot less than 3 or Greater than 20")
	private String name;
	
	@Size(min = 3, max = 20, message = "Valentine Name Cannot less than 3 or Greater than 20")
	private String valentineName;
	
	@NotBlank(message = "Place Should be Selected")
	private String place;
	
	@NotBlank(message = "Gift Should be Selected")
	private String gift;


}
