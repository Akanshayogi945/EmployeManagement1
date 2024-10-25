package com.avsoft.EmployeManagementProject.service;

import org.springframework.stereotype.Service;

@Service

public class TempraryServiceImpl implements EmployeService {

	@Override
	public void addEmploye() {
		System.out.println("temprary save to db");
		
	}

	@Override
	public Employe get() {
		// TODO Auto-generated method stub
		return null;
	}

}
