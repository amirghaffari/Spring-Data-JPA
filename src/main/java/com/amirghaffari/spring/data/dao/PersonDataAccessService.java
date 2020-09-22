package com.amirghaffari.spring.data.dao;

import com.amirghaffari.spring.data.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDataAccessService extends CrudRepository<Person, Long> {
}
