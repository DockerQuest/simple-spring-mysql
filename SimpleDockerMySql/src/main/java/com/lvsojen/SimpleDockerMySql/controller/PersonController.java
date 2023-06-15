package com.lvsojen.SimpleDockerMySql.controller;

import com.lvsojen.SimpleDockerMySql.entity.Person;
import com.lvsojen.SimpleDockerMySql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(final PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public List<Person> findAll() {
        return personService.findAll();
    }

    @GetMapping("/person/{personId}")
    public Person getPerson(@PathVariable("personId") int personId) {
        return personService.findById(personId);
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person thePerson) {
        return personService.save(thePerson);
    }

    @PutMapping("/person/{personId}")
    public Person updatePerson(@PathVariable("personId") int personId, @RequestBody Person updatePerson) {
        return personService.update(personId, updatePerson);
    }

    @DeleteMapping("/person/{personId}")
    public String deletePerson(@PathVariable("personId") int personId) {
        personService.deleteById(personId);
        return "Deleted employee id - " + personId;
    }
}
