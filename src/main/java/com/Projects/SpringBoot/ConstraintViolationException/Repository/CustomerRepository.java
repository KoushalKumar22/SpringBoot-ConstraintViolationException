package com.Projects.SpringBoot.ConstraintViolationException.Repository;

import com.Projects.SpringBoot.ConstraintViolationException.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
