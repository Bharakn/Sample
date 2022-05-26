package cg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import cg.demo.entities.Customer;
import cg.demo.services.CustomerService;

@RestController
@RequestMapping("/cust")
public class CustomerController 
{
     @Autowired
     CustomerService custservice;
     

 	@PostMapping
 	public ResponseEntity<String> addDepartment(@RequestBody Customer cust)
 	{
 		custservice.addCustomer(cust);;
 		
 		return new ResponseEntity<String>("inserted",HttpStatus.OK);
 	}
     
}
