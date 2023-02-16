package com.xworkz.valentineApp.service;

import java.util.Collections;
import java.util.Set;

import javax.xml.validation.Validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.valentineApp.dto.ValentineDTO;
import com.xworkz.valentineApp.entity.ValentineEntity;
import com.xworkz.valentineApp.repository.ValentineRepository;

@Service
public class ValentineServiceImpl implements ValentineService{

	@Autowired
	private ValentineRepository repository;
	public ValentineServiceImpl() {
		System.out.println("Constructor is Created  : " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto,can save");
			ValentineEntity entity=new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlace(dto.getPlace());
			entity.setGift(dto.getGift());
			boolean save=this.repository.save(entity);
			System.out.println("saved to repository "+save);
			return Collections.emptySet();
		}
	}


}
