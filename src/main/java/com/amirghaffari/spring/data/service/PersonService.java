package com.amirghaffari.spring.data.service;

import com.amirghaffari.spring.data.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final CrudRepository<Person, Long> repository;

    @Autowired
    public PersonService(CrudRepository<Person, Long> repository) {
        this.repository = repository;
    }

    public List<Person> findAll() {
        Iterable<Person> it = repository.findAll();
        List<Person> people = new ArrayList<Person>();
        it.forEach(e -> people.add(e));
        return people;
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public void deletePerson(Long id) {
        Optional<Person> p = repository.findById(id);
        if(p.isPresent())
            repository.delete(p.get());
    }

    public Person getPersonById(Long id) {
        return repository.findById(id).orElse(null);
    }

}
