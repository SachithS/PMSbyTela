package com.tela.pms.service.impl;

import org.springframework.stereotype.Service;
import com.tela.pms.service.IndividualPatientService;


@Service
public class IndividualPatientServiceImpl implements IndividualPatientService{

	@Override
	public void findPatient(){
		
		System.out.println("Calling Service"); 
	}
}
