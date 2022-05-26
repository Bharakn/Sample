package cg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cg.demo.entities.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
