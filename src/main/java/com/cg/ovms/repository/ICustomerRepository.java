package com.cg.ovms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovms.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {


}