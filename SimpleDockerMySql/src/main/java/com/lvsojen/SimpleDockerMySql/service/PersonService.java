package com.lvsojen.SimpleDockerMySql.service;

import com.lvsojen.SimpleDockerMySql.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person save(Person person);
    List<Person> findAll();
    Person findById(int id);
    Person update(int id, Person person);
    void deleteById(int id);
}
