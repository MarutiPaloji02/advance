package com.xworkz.bakeryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakeryapp.dto.BakeryDTO;
import com.xworkz.bakeryapp.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService{
	
	@Autowired
	private BakeryRepository bakaryRepository;

	
	@Override
	public boolean validatAndSave(BakeryDTO bakeryDTO) {
		System.out.println("Running validateAndSave");
		boolean save = bakaryRepository.save(bakeryDTO);
		System.out.println("Save " + save);
		return false;
	}

}
