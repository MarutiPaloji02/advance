package com.xworkz.valentineApp.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.xworkz.valentineApp.dto.ValentineDTO;

@Service
public interface ValentineService {
	
	Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto);}
