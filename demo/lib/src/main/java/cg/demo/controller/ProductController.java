package cg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cg.demo.services.ProductService;

@RestController
@RequestMapping("/prod")
public class ProductController
{
	@Autowired
	ProductService proservice;
	

}
