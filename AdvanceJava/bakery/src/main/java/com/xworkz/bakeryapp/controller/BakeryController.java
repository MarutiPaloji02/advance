package com.xworkz.bakeryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakeryapp.dto.BakeryDTO;
import com.xworkz.bakeryapp.service.BakeryService;

@Controller
@RequestMapping("/save")
public class BakeryController {

	@Autowired
	private BakeryService bakaryService;

	public BakeryController() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onBakery(BakeryDTO bakeryDTO, Model model) {
		System.out.println("Running OnBakery......." + bakeryDTO);
		model.addAttribute("bakary_Name", bakeryDTO.getBakary_Name());
		model.addAttribute("owner_Name", bakeryDTO.getOwner_Name());
		model.addAttribute("owner_Wife_Name", bakeryDTO.getOwner_Wife_Name());
		model.addAttribute("owner_Married", bakeryDTO.isOwner_Married());
		model.addAttribute("bakary_Since", bakeryDTO.getBakary_Since());
		model.addAttribute("famous_For", bakeryDTO.getFamous_For());
		boolean save = this.bakaryService.validatAndSave(bakeryDTO);
		System.out.println(save);
		return "display";

	}

}
