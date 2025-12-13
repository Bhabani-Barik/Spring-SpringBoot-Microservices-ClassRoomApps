package com.kanha.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kanha.entity.CustomerEntity;

@Repository
public interface ICustomerRepository  extends CrudRepository<CustomerEntity, Integer>{

}