package com.amirghaffari.spring.data.api;

import com.amirghaffari.spring.data.model.Person;
import com.amirghaffari.spring.data.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;


    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.save(person);
    }

    @GetMapping
    public List<Person> getAllPerson() {
        return personService.findAll();
    }

    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") Long id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") Long id) {
        personService.deletePerson(id);
    }

    @PutMapping
    public void updatePerson(@Valid @NotNull @RequestBody Person person) {
        personService.save(person);
    }
}
