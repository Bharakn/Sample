package cg.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cg.demo.entities.Customer;
import cg.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository custrepo;

	@Override
	public void addCustomer(Customer cust) {
		custrepo.save(cust);
	}

}
