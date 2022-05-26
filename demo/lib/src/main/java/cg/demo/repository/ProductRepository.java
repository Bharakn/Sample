package cg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cg.demo.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
