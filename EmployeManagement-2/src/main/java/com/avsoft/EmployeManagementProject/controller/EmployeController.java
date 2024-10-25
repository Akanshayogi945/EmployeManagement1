package com.avsoft.EmployeManagementProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avsoft.EmployeManagementProject.service.Employe;
import com.avsoft.EmployeManagementProject.service.EmployeService;
import com.avsoft.EmployeManagementProject.service.PermanentServiceImpl;
import com.avsoft.EmployeManagementProject.service.TempraryServiceImpl;

@RestController
public class EmployeController {
	@Autowired
	EmployeService permanentServiceImpl ;
	@Autowired
	EmployeService tempraryServiceImpl ;
	
	@PostMapping("createEmploye/{type}")
	public String createEmploye(@RequestBody  Employe employe ,@PathVariable("type") String type) {
		if(type.equals("permanentServiceImpl")){
			permanentServiceImpl.addEmploye();
			
			if(type.equals("tempraryServiceImpl")) {
				tempraryServiceImpl.addEmploye();
				tempraryServiceImpl.get();
				
			}
			
		}
		
		
		return "created";
		
		
	}
	

}
