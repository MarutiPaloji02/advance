package com.xworkz.bakeryapp.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakeryapp.dto.BakeryDTO;

@Repository
public class BakeryRepositoryImpl implements BakeryRepository{

	public BakeryRepositoryImpl() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("Running Save");
		return false;
	}

}
